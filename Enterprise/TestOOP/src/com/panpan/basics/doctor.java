package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-21-上午 10:35
 */
public class doctor extends Human{

    int num;

    double knife;
    public void act(){
        System.out.println("doctor act 啊 手术台");


    }

    public void weight(){
        System.out.println("doctor weight 100kg,and ta 吃胖了");
    }

    public doctor() {
    }

    public doctor(int num, double knife) {
        this.num = num;
        this.knife = knife;
    }

    public String toString(){
        return "doctor num is "+num+" knife is "+knife;
    }
}
