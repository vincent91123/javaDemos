package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-23-上午 09:01
 */
public interface TestInerface {
    public static final int NUM=10;
    public abstract void a();
    public default void b(){
        System.out.println("--------TestInerface.b()");
    }
    public  static  void c(){
        System.out.println("这个是静态方法c");
    }

}


class Demo implements TestInerface{

    public void cc(){
        b();
        System.out.println("--------Demo.c()");
        TestInerface.super.b();
//        System.out.println("--------TestInerface中的静态方法");
    }

    @Override
    public void a() {
        System.out.println("重写了a方法");
    }

    @Override
    public  void b() {
        System.out.println("Demo中的b方法");
//        TestInerface.super.b();
    }
    public static void c(){
        System.out.println("Demo中的静态方法c");
    }
}

class  A{

    public static void main(String[] args) {
        Demo d=new Demo();
        d.c();
        Demo.c();
        TestInerface.c();
    }


}