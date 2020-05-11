package com.song.p7.platform.pojo;

import com.song.p7.platform.base.TimeStampDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Users extends TimeStampDB implements Serializable {
    private String id;

    private String username;

    private String password;

    private String nickname;

    private String realname;

    private String face;

    private String mobile;

    private String email;

    private Integer sex;

    private Date birthday;

    private static final long serialVersionUID = 1L;

}