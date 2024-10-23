package com.panpan.Thread;

/**
 * @author panpan
 * @create 2024-09-07-上午 09:44
 */
public class CustomerThread extends Thread{
    private Product p;
    public CustomerThread(Product p){
        this.p=p;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
           synchronized(p){
               p.getProduct();
            }

        }
    }
}

class Tester{
    public static void main(String[] args) {
        Product p=new Product();
        ProductThread pt=new  ProductThread(p);

        CustomerThread ct=new  CustomerThread(p);

        pt.start();
        ct.start();
    }
}
