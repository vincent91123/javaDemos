package com.panpan.Thread;

/**
 * @author panpan
 * @create 2024-09-06-上午 08:54
 */
public class threadsB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=50; i++) {
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"-----------"+i);
            }

        }
    }
}


class threadsBTest{
    public static void main(String[] args) {


        Thread thread = new Thread(new threadsB(), "panpan");
        thread.setDaemon(true);
        thread.start();

        //Thread.currentThread().setName("main");
        for (int i = 0; i <= 50; i++) {
            System.out.println( Thread.currentThread().getName()+"-----------------"+i);
        }
    }


}
