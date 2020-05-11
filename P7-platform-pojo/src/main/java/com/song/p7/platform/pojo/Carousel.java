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
public class Carousel extends TimeStampDB implements Serializable {
    private String id;

    private String imageUrl;

    private String backgroundColor;

    private String itemId;

    private String catId;

    private Integer type;

    private Integer sort;

    private Integer isShow;

    private static final long serialVersionUID = 1L;

}