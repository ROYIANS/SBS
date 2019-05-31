package cn.royians.sbs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateExample {
    public String stampToDateString(Date s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        res = simpleDateFormat.format(s);
        return res;
    }

    public Date stringToDateTime(String s) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(s);
    }

    public Date stampToDate(String s){
        long lt = new Long(s);
        return new Date(lt);
    }

    private String dateToStringAll(Date date) {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }

    private String dateToString(Date date) {
        SimpleDateFormat sdf= new SimpleDateFormat("MM月dd日 HH:mm");
        return sdf.format(date);
    }


    private String dateToStringTime(Date date) {
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
        return sdf.format(date);
    }

    private Map<String, Integer> dateDiff(Date date) {
        Date nowDate = new Date();
        String thatYear = new SimpleDateFormat("yyyy").format(date);
        String thisYear = new SimpleDateFormat("yyyy").format(nowDate);
        long between = nowDate.getTime()-date.getTime();
        int year = Integer.valueOf(thisYear) - Integer.valueOf(thatYear);
        int day = Math.toIntExact(between / (24 * 60 * 60 * 1000));
        int hour = Math.toIntExact((between / (60 * 60 * 1000) - day * 24));
        int min = Math.toIntExact(((between / (60 * 1000)) - day * 24 * 60 - hour * 60));
        int s = Math.toIntExact((between / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60));
        Map<String, Integer> res = new HashMap<>();
        res.put("year", year);
        res.put("day", day);
        res.put("hour", hour);
        res.put("min", min);
        res.put("s", s);
        return res;
    }

    public String dateToWord(Date date) {
        Map<String, Integer> diff = this.dateDiff(date);
        String res = this.dateToStringAll(date);
        if(diff.get("year").equals(0)){
            res = this.dateToString(date);
            if(diff.get("day").equals(1)){
                res = "昨天 "+this.dateToStringTime(date);
            }
            if(diff.get("day").equals(0)){
                res = "今天 "+this.dateToStringTime(date);
                if(diff.get("hour").equals(0)){
                    res = diff.get("min") + " 分钟前";
                    if(diff.get("min").equals(0)){
                        res = "刚刚";
                    }
                }
            }
        }
        return res;
    }

}
