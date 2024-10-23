package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-22-上午 09:40
 */
public class Boy {
    int age;
    String name;
    
    public void buy(){
        System.out.println("这是我的小迷妹耶，要买买么");
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
