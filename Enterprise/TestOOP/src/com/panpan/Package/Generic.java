package com.panpan.Package;

import java.util.ArrayList;
import java.util.List;

/**
 * @author panpan
 * @create 2024-08-30-上午 09:04
 */
public class Generic <A,B,C>{
    A name;
    B age;
    C className;

    public  void shows(A a,B b,C c){
//        A[] i=new A[10]; 会报错的
          A[] i=(A[]) new Object[10];
    }
//    public static void show<A,B,C>(){
        //不可以使用静态修饰泛型
//    }

    public void b(){
        ArrayList<String> AA=null;
        ArrayList<Integer> ii=null;
//        AA=ii; 不同类型的泛型不可以直接赋值
    }

    
}

class ss<E>{
/*    public void a(List<Object> list){

    }
    public void a(List<String> list){

    }
    public void a(List<Integer> list){

    }*///这样写是不行的，因为泛型是在编译期确定的，而这里是在运行期确定的
    //这样的情况是因为并列关系

    public void a(List<?> list){
        for (Object o:list){
            System.out.println(o);
        }
        list.add(null);//数据不可以随意的添加修改
        list.get(0);//数据的获取
    }

}

class Geric<E>{
    public void T(E e){

    }

    public <T> void tt(T t){ //这个是泛型方法，可以是静态的

    }

    public static void main(String[] args) {
        Object oo=new Object();
        String ss=new String();
        oo=ss;

        Object[] oos=new Object[10];
        String[] sss=new String[10];
        oos=sss;
//        多态的两种形式，是父子继承关系
//        但是G<A> G<B>是并列关系

        List<Object> ooG=new ArrayList<>();
        List<String> ssG=new ArrayList<>();
//        ooG=ssG;

        ss s1=new ss();
        s1.a(new ArrayList<Integer>());
        s1.a(new ArrayList<String>());
        s1.a(new ArrayList<Object>());


        Geric<String> gg=new Geric<String>();
        gg.tt(1);
        gg.T("panpan");

        List<String> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Object> list3=new ArrayList<>();

        List<?> list=null;
        List<? extends Object> list4=null;
        List<? super Object> list5=null;
        list=list1;
        list=list2;
        list=list3;
    }
}


