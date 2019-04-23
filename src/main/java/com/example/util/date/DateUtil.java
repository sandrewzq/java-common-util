package com.example.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ author Administrator
 * @ date 2017/3/23 10:07
 */
public class DateUtil {

    /**
     * 字符串转换成 Date
     *
     * @param timeStr 时间字符串
     * @param format  传入的字符串格式
     * @return
     */

    public static Date parseDateString(String timeStr, String format) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.parse(timeStr);
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
}
