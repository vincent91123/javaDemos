package com.panpan.Thread;

import javafx.scene.layout.Priority;

/**
 * @author panpan
 * @create 2024-09-06-上午 10:14
 */
public class Priorityss extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=20; i++) {
            System.out.println("这个是A的循环遍历"+"----------------"+i);
        }
    }
}


class PriorityBb extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <=20; i++) {
            System.out.println("----------------这个是B的循环遍历-------"+i);
        }
    }
}

class BBTest {

    public static void main(String[] args) {

        PriorityBb t2 = new PriorityBb();
        Priorityss t1 = new Priorityss();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start(); t1.start();

    }

}