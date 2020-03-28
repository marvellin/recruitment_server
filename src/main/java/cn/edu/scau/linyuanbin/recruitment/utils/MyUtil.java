package cn.edu.scau.linyuanbin.recruitment.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: linyuanbin
 * @Description:
 * 自定义工具类
 * 1.获取格式化日期yyyy-MM-dd
 * 2.获取格式化时间yyyy-MM-dd HH:mm:ss
 * @Date: Created in 0:56 2020/3/26
 */
public class MyUtil {
    /*
    *获取格式化日期yyyy-MM-dd
    * */
    public static String getFormatDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = sdf.format(date);
        return formatDate;
    }

    /*
    * 获取格式化时间yyyy-MM-dd HH:mm:ss
    * */
    public static String getFormatTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formatTime = sdf.format(date);
        return formatTime;
    }
}
