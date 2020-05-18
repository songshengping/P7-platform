package com.song.p7.platform.controller;

import com.song.p7.platform.bo.UserBO;
import com.song.p7.platform.pojo.Users;
import com.song.p7.platform.service.UserService;
import com.song.p7.platform.utils.APIErrorCode;
import com.song.p7.platform.utils.APIResponse;
import com.song.p7.platform.utils.ValidateUtils;
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

        /**
         * 1. 邮箱校验
         */
        if (!ValidateUtils.isEmail(user.getEmail())) {
            return new APIResponse<>(APIErrorCode.EMAIL_ERROR);
        }

        /**
         * 2. 密码校验
         */
        if (!StringUtils.equals(user.getPassword(), user.getConfirmPassword())) {
            return new APIResponse<>(APIErrorCode.USER_PASSOWRD_NOT_SAME);
        }

        /**
         * 3. 用户名是否存在
         */
        if (userService.usernameIsExist(user.getUsername())) {
            return new APIResponse<>(APIErrorCode.USER_EXIST);
        }

        return new APIResponse<>(userService.createUser(user));
    }

    @GetMapping(value = "/login")
    public APIResponse<Boolean> login(@RequestParam(value = "username", name = "username")String username,
                                      @RequestParam(value = "password", name = "password")String password){
        Users user = userService.findUserByUsername(username);
        if (user == null) {
            return new APIResponse<>(APIErrorCode.USER_USERNAME_PASSWORD_ERROR);
        }

        if (!password.equals(user.getPassword())) {
            return new APIResponse<>(APIErrorCode.USER_USERNAME_PASSWORD_ERROR);
        }

        return null;
    }

}
