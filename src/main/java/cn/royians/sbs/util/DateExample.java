package cn.royians.sbs.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static String stampToDateString(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    public static Date stampToDate(String s){
        long lt = new Long(s);
        return new Date(lt);
    }

}
