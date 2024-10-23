package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-22-上午 09:41
 */
public class Girl {

    String name;
    double height;

    public  void  add(int a){
        System.out.println(a);
        System.out.println(a+100);
    }

    public void love(Boy b){
        System.out.println("这是我中意的男孩纸"+b.name+"他今年"+b.age+"岁了");
    }

    public Girl(String name, double height) {
        this.name = name;
        this.height = height;
    }
}
