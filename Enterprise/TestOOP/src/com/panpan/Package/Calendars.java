package com.panpan.Package;

import java.util.Calendar;

/**
 * @author panpan
 * @create 2024-08-27-上午 09:04
 */
public class Calendars {
    public static void main(String[] args) {
        System.out.print("请输入一个日期：按照格式(yyyy-MM-dd)");
        String strDate=new java.util.Scanner(System.in).next();
//        System.out.println(strDate);
        java.sql.Date date=java.sql.Date.valueOf(strDate);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);

        System.out.println("输入的日期是："+date);
        int maxDays=cal.getActualMaximum(Calendar.DATE);
        int nowDays=cal.get(Calendar.DATE);
        int nulls=cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println(nulls);

        int num=0;
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        for (int i = 0; i < nulls - 1; i++) {
            System.out.print(" "+"\t");
        }
        num=num+nulls-1;
        for (int i = 1; i <= maxDays; i++) {

            if (i==nowDays) {
                System.out.print(i+"*\t");
            }else {
                System.out.print(i+"\t");
            }
            num++;
            if (num%7==0) {
                System.out.println();
            }

        }
    }
}
