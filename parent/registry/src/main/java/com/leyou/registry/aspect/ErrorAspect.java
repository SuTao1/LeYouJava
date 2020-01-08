package com.leyou.registry.aspect;

import com.leyou.registry.result.AppException;
import com.leyou.registry.result.AppResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.BeanUtils;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class ErrorAspect {

    @Around("execution(* com.leyou.registry.service.impl.*.*(..))")
    public AppResult aroundInvoke(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("进入异常切面");
        AppResult appResult = new AppResult();
        try {
            appResult = (AppResult) proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            if(throwable instanceof AppException){
                BeanUtils.copyProperties(throwable, appResult);
                appResult.setState(false);
            }else{
                appResult = new AppResult(false, "系统异常", 500, null);
            }
        }
        return appResult;
    }
}
