package com.song.p7.platform.controller;

import com.song.p7.platform.constant.MemoryValue;
import com.song.p7.platform.utils.APIResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 系统配置
 * @Author songshengping
 * @Date 2020/4/8
 * @Version 1.0
 **/
@RestController
public class WebSystemController {

    @PostMapping(value = "/i18n")
    public APIResponse<Boolean> setI18n(@RequestParam(value = "lang") String lang) {
        MemoryValue.DEFAULT_LANGUAGE = lang;
        return new APIResponse<>(true);
    }
    @GetMapping(value = "/i18n")
    public APIResponse<String> getI18n() {
        return new APIResponse<>(MemoryValue.DEFAULT_LANGUAGE);
    }
}
