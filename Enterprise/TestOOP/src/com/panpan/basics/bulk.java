package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-19-下午 03:27
 */
public class bulk {
    int a;

    public void a(){
        System.out.println("-----a");
        {
            System.out.println("-----这是普通方法的块");
        }
    }
    public static void b(){
        System.out.println("-----b");
    }
    {
        System.out.println("-----这是块");
    }

    static{
        System.out.println("-----这是static块");
    }

    public  bulk(){
        System.out.println("这是空构造器");
    }

    public bulk(int a){
        this.a=a;
        System.out.println("这是带参数构造器");
    }


    public static void main(String[] args) {
        bulk b = new bulk();
        b.a();

    }
}
