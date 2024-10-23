package com.panpan.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author panpan
 * @create 2024-09-07-上午 09:35
 */
public class Product{

    private String brand;
    private String name;

    boolean  flag = true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Lock lock = new ReentrantLock();

    Condition  produceCon = lock.newCondition();
    Condition  consumeCon = lock.newCondition();

    public  void setProduct(String name,String brand) {
        lock.lock();
        try {
            if (flag==true) {
                try {
//                    wait();
                    produceCon.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);

            System.out.println("生产者生产了：" + this.getBrand() + "------" + this.getName());
            flag=true;
//            notify();
            consumeCon.signal();
        }finally {

            lock.unlock();
        }


    }

    public  void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                try {
//                    wait();
                consumeCon.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("消费者消费了：" + this.getBrand() + "------" + this.getName());
            flag=false;
//            notify();
            produceCon.signal();
        }finally {
            lock.unlock();
        }


    }
}
