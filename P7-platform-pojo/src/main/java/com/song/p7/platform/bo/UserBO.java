package com.song.p7.platform.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Description 新增用户请求类
 * @Date 2020/5/11 21:35
 * @Created by Jeremy
 */
@Getter
@Setter
public class UserBO {

    @ApiModelProperty(value = "登录名")
    @JsonProperty(value = "username")
    private String username;

    @ApiModelProperty(value = "密码")
    @JsonProperty(value = "password")
    private String password;

    @ApiModelProperty(value = "确认密码")
    @JsonProperty(value = "confirmPassword")
    private String confirmPassword;

    @ApiModelProperty(value = "昵称")
    @JsonProperty(value = "nickname")
    private String nickname;

    @ApiModelProperty(value = "真实姓名")
    @JsonProperty(value = "realname")
    private String realname;

    @ApiModelProperty(value = "头像")
    @JsonProperty(value = "face")
    private String face;

    @ApiModelProperty(value = "手机号")
    @JsonProperty(value = "mobile")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    @JsonProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "性别")
    @JsonProperty(value = "sex")
    private Integer sex;

    @ApiModelProperty(value = "生日(yyyy-MM-dd)")
    @JsonProperty(value = "birthday")
    private String birthday;
}
