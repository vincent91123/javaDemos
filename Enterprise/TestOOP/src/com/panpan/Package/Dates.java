package com.panpan.Package;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author panpan
 * @create 2024-08-26-下午 03:09
 */
public class Dates {
    public static void main(String[] args) throws ParseException {

        Calendar cal1=new GregorianCalendar();
        Calendar cal2=Calendar.getInstance();
        System.out.println(cal1);
        System.out.println(cal2);
//        常用方法
        System.out.println(cal1.get(Calendar.YEAR));
        System.out.println(cal1.get(Calendar.MONTH));
        System.out.println(cal1.get(Calendar.DATE));
        System.out.println(cal1.get(Calendar.HOUR));
        System.out.println(cal1.getActualMaximum(Calendar.DATE));
        System.out.println(cal1.getActualMinimum(Calendar.DATE));

        cal1.set(Calendar.DATE,15);
        System.out.println(cal1.get(Calendar.DATE));
        cal1.set(Calendar.MONTH,11);
        System.out.println(cal1.get(Calendar.MONTH));
        cal1.set(Calendar.YEAR,2045);
        System.out.println(cal1.get(Calendar.YEAR));
        System.out.println(cal1);

        java.sql.Date date=java.sql.Date.valueOf("2022-5-15");
        System.out.println(date);
        cal1.setTime(date);

/*        DateFormat df=new SimpleDateFormat("yyyy-MM-dd") ;
        Date d= df.parse("2024-08-26");
        System.out.println(d);

        String format=df.format(new Date());
        System.out.println(format);*/

/*        Date d = new Date(1724656741587L);
        System.out.println(d);

    java.util.Date  d1 = new java.util.Date();
   // Date date1=(Date) d1;
//   利用构造器向下转型
    Date date2=new Date(d.getTime());

    java.sql.Date d2= java.sql.Date.valueOf("2024-08-26");
        System.out.println(d2);
    java.util.Date date=d2;
    System.out.println(date);*/

    }
/*    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.toGMTString());
        System.out.println(System.currentTimeMillis());

//        一般用来衡量算法所用的时间
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }*/

}
