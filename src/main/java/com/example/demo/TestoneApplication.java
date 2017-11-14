package com.example.demo;

import com.example.demo.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class TestoneApplication extends SpringBootServletInitializer {
    //通过代码注册Servlet示例代码：
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new HelloServlet(), "/xiaohong/1");
    }

    public static void main(String[] args) {
        SpringApplication.run(TestoneApplication.class, args);
    }
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(TestoneApplication.class);
//	}
}
