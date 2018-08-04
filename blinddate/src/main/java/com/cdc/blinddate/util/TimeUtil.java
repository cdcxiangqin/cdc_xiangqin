package com.cdc.blinddate.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @name: TimeUtil
 * @description: 时间工具类
 * @author: 纪佳鸿
 * @time: 2018/8/4 10:10
 */
public class TimeUtil {
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy MM dd HH:mm:ss");

    //获取Date的时间字符串
    public static String getTimeString(Date date){
        if(null!=date)
            return sdf.format(date);
        return null;
    }
}
