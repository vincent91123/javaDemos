package com.panpan.Thread;

/**
 * @author panpan
 * @create 2024-09-07-上午 09:37
 */
public class ProductThread extends Thread{

    private Product p;

    public ProductThread(Product p){
        this.p = p;
    }


    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            if (i%2==0) {
                p.setProduct("费列罗","巧克力");
            }else {
                p.setProduct("犀利","1664啤酒");
            }

        }
    }
}

