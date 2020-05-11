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
public class ItemsComments extends TimeStampDB implements Serializable {
    private String id;

    private String userId;

    private String itemId;

    private String itemName;

    private String itemSpecId;

    private String sepcName;

    private Integer commentLevel;

    private String content;

    private static final long serialVersionUID = 1L;

}