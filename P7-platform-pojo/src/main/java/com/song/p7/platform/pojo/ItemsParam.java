package com.song.p7.platform.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class ItemsParam implements Serializable {
    private String id;

    private String itemId;

    private String producPlace;

    private String footPeriod;

    private String brand;

    private String factoryName;

    private String factoryAddress;

    private String packagingMethod;

    private String weight;

    private String storageMethod;

    private String eatMethod;

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

}