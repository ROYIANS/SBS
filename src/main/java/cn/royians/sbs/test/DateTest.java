package cn.royians.sbs.test;


import cn.royians.sbs.util.DateExample;

import java.text.ParseException;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        String stamp = "2018-05-26 15:41:00";
        DateExample dateExample = new DateExample();
        Date date = dateExample.stringToDateTime(stamp);
        System.out.println(dateExample.dateToWord(date));
    }
}
