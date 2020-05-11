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
public class ItemsImg extends TimeStampDB implements Serializable {
    private String id;

    private String itemId;

    private String url;

    private Integer sort;

    private Integer isMain;

    private static final long serialVersionUID = 1L;

}