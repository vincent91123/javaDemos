package com.panpan.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author panpan
 * @create 2024-09-06-上午 08:45
 */
public class BuyTicketThreadB implements Runnable {

    static int ticket=15;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            try {
                if (ticket>0) {
                    System.out.println(" 我从"+Thread.currentThread().getName()+"买到了从上海到深圳的高铁票"+ (ticket--) +"张车票"); //Thread.currentThread().getName()+
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

}

class BuyTicketTest{
    public static void main(String[] args) {
        BuyTicketThreadB bt =new BuyTicketThreadB();
        Thread t1=new Thread(bt, "A");
        Thread t2=new Thread(bt,"B");
        Thread t3=new Thread(bt,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
