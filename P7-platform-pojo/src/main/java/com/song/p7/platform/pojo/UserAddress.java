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
public class UserAddress extends TimeStampDB implements Serializable {
    private String id;

    private String userId;

    private String receiver;

    private String mobile;

    private String province;

    private String city;

    private String district;

    private String detail;

    private String extand;

    private Integer isDefault;

    private static final long serialVersionUID = 1L;

}