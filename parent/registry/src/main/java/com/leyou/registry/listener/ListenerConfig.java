package com.leyou.registry.listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ListenerConfig implements WebMvcConfigurer {

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Bean
    public ServletListenerRegistrationBean listenerRegist(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new UserListener());
        System.out.println("配置了监听器");
        return servletListenerRegistrationBean;
    }
}
