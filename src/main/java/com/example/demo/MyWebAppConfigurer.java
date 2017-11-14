package com.example.demo;

import com.example.demo.interceptor.MyInterceptor1;
import com.example.demo.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by flyme
 * on 2017/11/6 20:28
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    public void addInterceptors(InterceptorRegistry registry){
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
    public void addResorceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
        super.addResourceHandlers(registry);
    }
}
