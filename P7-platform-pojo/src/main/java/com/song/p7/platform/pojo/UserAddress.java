package com.song.p7.platform.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class UserAddress implements Serializable {
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

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

}