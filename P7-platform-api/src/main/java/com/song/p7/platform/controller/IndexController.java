package com.song.p7.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 页面跳转Controller
 * @Date 2020/5/12 23:11
 * @Created by Jeremy
 */
@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index(ModelMap modelMap){
        return "index.html";
    }

    @GetMapping(value = "/thymeleaf")
    public String getThymeleafDemo(ModelMap modelMap){
        modelMap.addAttribute("msg", "这是第一个Thymeleaf的例子");
        return "index";
    }

}
