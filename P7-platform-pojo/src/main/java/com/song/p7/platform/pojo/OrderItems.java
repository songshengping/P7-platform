package com.song.p7.platform.pojo;

import com.song.p7.platform.base.TimeStampDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class OrderItems extends TimeStampDB implements Serializable {
    private String id;

    private String orderId;

    private String itemId;

    private String itemImg;

    private String itemName;

    private String itemSpecId;

    private String itemSpecName;

    private Integer price;

    private Integer buyCounts;

    private static final long serialVersionUID = 1L;

}