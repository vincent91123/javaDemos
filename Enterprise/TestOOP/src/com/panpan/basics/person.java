package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-19-上午 11:28
 */
public class person {

//    protected double score;

    /*
    * 1.没有return 的
    * 2.名字必须和类名一样的
    * */
    public person(){

    }
    public person(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    int age;
    double height;

    public void  eat(){
        System.out.println("我喜欢吃饭");
    }
}
