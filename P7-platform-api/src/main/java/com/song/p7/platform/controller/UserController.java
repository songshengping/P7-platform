package com.song.p7.platform.controller;

import com.song.p7.platform.bo.UserBO;
import com.song.p7.platform.service.UserService;
import com.song.p7.platform.utils.APIErrorCode;
import com.song.p7.platform.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Date 2020/5/10 22:17
 * @Created by Jeremy
 */
@RestController
@Api(value = "/user", tags = {"用户操作相关数据接口"})
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{username}")
    @ApiOperation(value = "检验用户是否存在", notes = "检验用户是否存在")
    public APIResponse<Boolean> usernameIsExist(@ApiParam(value = "用户名") @PathVariable(value = "username", name = "username") String username){
        if (StringUtils.isBlank(username)) {
            return new APIResponse<>(APIErrorCode.PARAM_ERROR);
        }
        return new APIResponse<>(userService.usernameIsExist(username));
    }

    @PostMapping(value = "/register")
    @ApiOperation(value = "用户注册", notes = "用户注册")
    public APIResponse<Boolean> usernameIsExist(@RequestBody UserBO user){
        // 校验参数
        return new APIResponse<>(userService.createUser(user));
    }
}
