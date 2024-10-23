package com.panpan.Thread;

/**
 * @author panpan
 * @create 2024-09-05-下午 04:37
 */
public class threads {
    public static void main(String[] args) {
        Thread.currentThread().setName("main");
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"dadss--11----------------"+i);
        }
        threadss ss=new threadss("子线程");
        ss.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"22------------------dadww"+i);
        }
    }
}


class threadss extends Thread{

    public threadss(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName()+"--------son----------"+i);
        }
    }
}