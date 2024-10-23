package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-23-上午 09:33
 */
public class TestOuter {
    /*
    * 1.类的组成有：属性,方法,构造器,块(普通块，静态块，同步块，构造块，方法块)，内部类
    * 2.类(内部的，外部的)
    * 3.成员内部类和局部内部类
    * 4.成员内部类：(里面属性，方法，构造器等)
    *   修饰符：private default protected  public  abstract
    * */
    public void method(){
        int age=30;
        class A {

            public void methodA(){
//                 age=20;
                System.out.println(age);
            }
        }
    }

    public Comparable method2(){
        class B implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 100;
            }
        }
        return new B();
    }

    public Comparable methiod3(){
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
    }
    public void teat(){
        Comparable com=new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
        System.out.println(com.compareTo("abc"));
    }
}
