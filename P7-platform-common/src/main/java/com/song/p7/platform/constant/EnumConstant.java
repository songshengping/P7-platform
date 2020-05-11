package com.song.p7.platform.constant;

import lombok.Getter;

/**
 * @Description 枚举常量
 * @Date 2020/5/11 21:51
 * @Created by Jeremy
 */
public class EnumConstant {

    @Getter
    public enum SexEnum{
        FEMALE(0),
        MALE(1),
        CONFIDENTIAL(-1);
        private int code;
        SexEnum(int code){
            this.code = code;
        }
    }
}
