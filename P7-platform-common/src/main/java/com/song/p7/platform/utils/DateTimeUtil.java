package com.song.p7.platform.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @Date 2020/5/11 22:46
 * @Created by Jeremy
 */
public class DateTimeUtil {
    public static final String PATTERN_DATE_DEFAULT = "yyyy-MM-dd";

    public static Date stringToDate(String str){
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE_DEFAULT);
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN_DATE_DEFAULT);
        return sdf.format(date);
    }
}
