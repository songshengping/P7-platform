package com.song.p7.platform.pojo;

import com.song.p7.platform.base.TimeStampDB;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Test implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Test(String name) {
        this.name = name;
    }
}