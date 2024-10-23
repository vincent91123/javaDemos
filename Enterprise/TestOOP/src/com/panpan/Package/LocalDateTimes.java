package com.panpan.Package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author panpan
 * @create 2024-08-27-上午 10:20
 */
public class LocalDateTimes {
    public static void main(String[] args) {

        DateTimeFormatter df1=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime=LocalDateTime.now();
        String str=df1.format(localDateTime);
        System.out.println(str);

        TemporalAccessor parse=df1.parse("2024-08-27T10:56:13.049");
        System.out.println(parse);
        
            
            /*
            * 本地化
            * 
            * 
            * */
        LocalDateTime now1=LocalDateTime.now();
        DateTimeFormatter df2=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String sdf2=df2.format(now1);
        System.out.println(sdf2);
        DateTimeFormatter df3=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String sdf3=df3.format(now1);
        System.out.println(sdf3);
        DateTimeFormatter df4=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String sdf4=df4.format(now1);
        System.out.println(sdf4);


        /*
        * 1.声明一个自定义格式
        *
        * */
        DateTimeFormatter df5=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        /*LocalDateTime --> String*/
        LocalDateTime now2=LocalDateTime.now();
        String sdf5=df5.format(now2);
        System.out.println("sdf5"+sdf5);

//      String --> LocalDate
        TemporalAccessor parse2=df5.parse("2024-08-27 11:11:45");
        System.out.println(parse);


/*
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDate localDate=LocalDate.now();
        LocalTime localTime =LocalTime.now();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalTime  localTime1=LocalTime.of(12,12,12);
        System.out.println("localTime1:"+localTime1);
        LocalDateTime localDateTime1=LocalDateTime.of(2024,8,27,12,12,12);
        System.out.println("localDateTime1:"+localDateTime1);
        LocalDate localDate1=LocalDate.of(2024,8,27);
        System.out.println("localDate1:"+localDate1);

//        不可变性
        LocalDateTime  localDateTime2=localDateTime.withMonth(9);
        System.out.println(localDateTime2);
        System.out.println(localDateTime);

        LocalDateTime  localDateTime3=localDateTime.plusMonths(9);
        System.out.println("plusMonths"+localDateTime3);
        System.out.println("localDateTime"+localDateTime);
        LocalDateTime  localDateTime4=localDateTime.minusMonths(3);
        System.out.println("minusMonths"+localDateTime4);
*/


    }


}
