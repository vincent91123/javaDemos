package com.panpan.exceptions;

import java.util.Scanner;

/**
 * @author panpan
 * @create 2024-08-23-上午 10:53
 */
public class Test {
    public static void main(String[] args) {

        Student s=new Student();
        s.setAge(10);
        s.setName("aiya");
        s.setSex('八');
        System.out.println(s);

//        method();
//        madd();


    }

    public static  void madd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int A=sc.nextInt();
        System.out.println("请输入第一个数：");
        int b=sc.nextInt();
        if (b==0) {
            throw new RuntimeException("数字是零怎么除啊，笨蛋！");
        }else {
            System.out.println(A/b);
        }

    }

    public static void method(){
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第一个数：");
            int A=sc.nextInt();
            System.out.println("请输入第一个数：");
            int b=sc.nextInt();
            if (b==0) {
                throw new RuntimeException();
            }
            System.out.println(A/b);
//            return; 先执行finally再执行return
        }catch (Exception e){
            System.out.println("程序异常了");
//            显示异常的类名
            System.out.println(e.toString());
//            显示异常的描述信息对应的字浮串来的
            System.out.println(e.getMessage());
//            显示异常的堆栈信息，将异常的信息捕获后，在控制台将异常的效果给展示出来
            System.out.println(e.getStackTrace());

//            throw e;  //碰到catch里面的throw 和 try里面的return 或者catch没有捕获异常 trycatch里面的代码不执行了
        }finally {
//            关闭数据库资源，关闭IO流资源，关闭   Ssockt资源
//            exit();这句话可以让后面的finally不执行
            System.out.println("感谢使用hello计算器");
        }
    }
}
