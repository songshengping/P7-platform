package com.song.p7.platform.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class OrderStatus implements Serializable {
    private String orderId;

    private Integer orderStatus;

    private Date createdTime;

    private Date payTime;

    private Date deliverTime;

    private Date successTime;

    private Date closeTime;

    private Date commentTime;

    private static final long serialVersionUID = 1L;

}