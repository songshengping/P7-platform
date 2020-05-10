package com.song.p7.platform.controller;

import com.song.p7.platform.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/5/10 20:34
 * @Created by Jeremy
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/test/{id}")
    public Object getTestInfo(@PathVariable Integer id){
        return testService.getTestInfo(id);
    }
}
