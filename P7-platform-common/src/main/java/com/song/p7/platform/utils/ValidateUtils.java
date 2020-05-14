package com.song.p7.platform.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @Description 参数校验
 * @Date 2020/5/14 22:15
 * @Created by Jeremy
 */
public class ValidateUtils {
    public static boolean isEmail(String email) {
        if (StringUtils.isBlank(email)) {
            return false;
        }
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

    public static boolean isPhoneNumber(String phoneNumber){
        if (StringUtils.isBlank(phoneNumber)) {
            return false;
        }
        String regex = "^[1]\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(phoneNumber).matches();
    }
}
