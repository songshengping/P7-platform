package com.song.p7.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/5/10 12:43
 * @Created by Jeremy
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello(){
        return "hello p7";
    }
}
