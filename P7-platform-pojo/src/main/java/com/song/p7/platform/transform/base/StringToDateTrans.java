package com.song.p7.platform.transform.base;

import com.song.p7.platform.utils.DateTimeUtil;

import java.util.Date;

/**
 * @Description 将BO中的String 转化成POJO的Date
 * @Date 2020/5/11 22:44
 * @Created by Jeremy
 */
public class StringToDateTrans {
    public String dateToString(Date date){
        return DateTimeUtil.dateToString(date);
    }

    public Date stringToDate(String str){
        return DateTimeUtil.stringToDate(str);
    }
}
