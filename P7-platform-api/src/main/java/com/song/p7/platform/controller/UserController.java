package com.song.p7.platform.controller;

import com.song.p7.platform.service.UserService;
import com.song.p7.platform.utils.APIErrorCode;
import com.song.p7.platform.utils.APIResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/5/10 22:17
 * @Created by Jeremy
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{username}")
    public APIResponse<Boolean> usernameIsExist(@PathVariable(value = "username", name = "username") String username){
        if (StringUtils.isBlank(username)) {
            return new APIResponse<>(APIErrorCode.PARAM_ERROR);
        }
        return new APIResponse<>(userService.usernameIsExist(username));
    }
}
