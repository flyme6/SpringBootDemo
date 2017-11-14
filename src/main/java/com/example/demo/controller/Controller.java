package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by flyme
 * on 2017/11/6 10:21
 */
@RestController
public class Controller {
    @RequestMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> hello = new HashMap<>();
        hello.put("data", "hello xh");
        hello.put("state", "ok");
        return hello;
    }
}
