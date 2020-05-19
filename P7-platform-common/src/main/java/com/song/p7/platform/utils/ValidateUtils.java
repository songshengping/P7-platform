package com.song.p7.platform.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @Description 参数校验
 * @Date 2020/5/14 22:15
 * @Created by Jeremy
 */
public class ValidateUtils {
    /**
     * 阿里开发手册 - 编程规约 - (十)其他
     * 1. 【强制】在使用正则表达式时，利用好其预编译功能，可以有效加快正则匹配速度。
     */
    public static Pattern emailPatten = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
    public static Pattern phonePatten = Pattern.compile("^[1]\\d{10}$");
    public static boolean isEmail(String email) {
        if (StringUtils.isBlank(email)) {
            return false;
        }
        return emailPatten.matcher(email).matches();
    }

    public static boolean isPhoneNumber(String phoneNumber){
        if (StringUtils.isBlank(phoneNumber)) {
            return false;
        }
        return phonePatten.matcher(phoneNumber).matches();
    }
}
