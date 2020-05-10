package com.song.p7.platform.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Items implements Serializable {
    private String id;

    private String itemName;

    private Integer catId;

    private Integer rootCatId;

    private Integer sellCounts;

    private Integer onOffStatus;

    private Date createdTime;

    private Date updatedTime;

    private String content;

    private static final long serialVersionUID = 1L;

}