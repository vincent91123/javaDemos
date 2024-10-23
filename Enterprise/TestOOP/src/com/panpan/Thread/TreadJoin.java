package com.panpan.Thread;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.SimpleFormatter;

/**
 * @author panpan
 * @create 2024-09-06-上午 10:40
 */
public class TreadJoin extends Thread{
    public TreadJoin(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}


class Testss extends Thread{
    public static void main(String[] args) { //秒表功能
        Format sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while (true){
            Date d=new Date();
            System.out.println(sf.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
/*    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.println("----main----"+i);
            if (i==6) {
                TreadJoin tj=new  TreadJoin("-----son------");
                tj.start();
//                tj.join();
            }

        }
    }*/
}