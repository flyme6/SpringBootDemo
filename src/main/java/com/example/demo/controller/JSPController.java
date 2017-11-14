package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by flyme
 * on 2017/11/6 10:37
 * 启动方式:
 * #必须⽤用sping-boot:run启动
 * mvn clean spring-boot:run
 */
@Controller
public class JSPController {
    @RequestMapping("/jsp/home")
    public String home() {
        return "home";
    }

}
