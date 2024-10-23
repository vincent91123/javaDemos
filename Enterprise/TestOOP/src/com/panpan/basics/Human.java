package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-21-上午 10:35
 */
public class Human {
    String name;
    int age;


    public void  play(Animal an){
        an.shout();
//        System.out.println("我是小动物,我可是会卖萌的");
    }


    /*    public void  play(Cat cat){
        cat.shout();
        cat.scarth();
    }

    public void  play(Dog dog){
        dog.shout();
        dog.guard();
    }*/
    public void height(){
        System.out.println("height is 80");
    }

    public void weight(){
        System.out.println("weight is 160");
    }
}
