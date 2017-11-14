package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by flyme
 * on 2017/11/6 10:49
 */
@Controller
public class FreemarkerController {
    @RequestMapping("/ftl/home1")
    public String home1(Model model) {
        model.addAttribute("time", new Date(System.currentTimeMillis()));
        return "home";
    }

    @RequestMapping("/ftl/home2")
    public ModelAndView home2() {
        ModelAndView res = new ModelAndView("home");
        res.addObject("time", new Date(System.currentTimeMillis()));
        return res;
    }
}
