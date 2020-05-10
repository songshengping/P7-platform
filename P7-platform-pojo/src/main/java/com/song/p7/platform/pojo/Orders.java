package com.song.p7.platform.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Orders implements Serializable {
    private String id;

    private String userId;

    private String receiverName;

    private String receiverMobile;

    private String receiverAddress;

    private Integer totalAmount;

    private Integer realPayAmount;

    private Integer postAmount;

    private Integer payMethod;

    private String leftMsg;

    private String extand;

    private Integer isComment;

    private Integer isDelete;

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

}