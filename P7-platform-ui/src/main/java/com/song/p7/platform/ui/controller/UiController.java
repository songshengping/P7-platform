package com.song.p7.platform.ui.controller;

import com.song.p7.platform.constant.MemoryValue;
import com.song.p7.platform.utils.APIResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 前端UI跳转页面
 * @Date 2020/5/12 23:31
 * @Created by Jeremy
 */
@Controller
public class UiController {

    @GetMapping(value = "/index")
    public String getIndexPage(ModelMap modelMap){
        modelMap.addAttribute("msg", "这是第一个Thymeleaf的例子");
        return "index.html";
    }

    @GetMapping(value = "/thymeleaf")
    public String getThymeleafPage(ModelMap modelMap){
        modelMap.addAttribute("msg", "这是第一个Thymeleaf的例子");
        return "index";
    }

}
