package com.leyou.registry.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private UserInterceptor userInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截所有路径，配置忽略一些配置
        registry.addInterceptor(userInterceptor).addPathPatterns("/**").
                excludePathPatterns("/test/user", "/re");
    }
}
