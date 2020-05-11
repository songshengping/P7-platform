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
public class Items extends TimeStampDB implements Serializable {
    private String id;

    private String itemName;

    private Integer catId;

    private Integer rootCatId;

    private Integer sellCounts;

    private Integer onOffStatus;

    private String content;

    private static final long serialVersionUID = 1L;

}