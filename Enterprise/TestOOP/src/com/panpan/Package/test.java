package com.panpan.Package;

/**
 * @author panpan
 * @create 2024-08-23-下午 02:53
 */
public class test {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("panpan");
        sb.append("hello");
        System.out.println(sb);

        sb.delete(3,6);
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("define");
        sb1.insert(3," ");

        StringBuilder sb2=new StringBuilder("panpan");
        sb.append("hello");
        System.out.println(sb);

        sb.delete(3,6);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        StringBuilder sb4=new StringBuilder("$229484859478");
        sb1.insert(3," ");
/*        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE-1);*/

        Integer i1=new Integer("122");
        System.out.println(i1);
//        Integer i2=new Integer("ss");
//        System.out.println(i2);

//        自动装箱 可以进行数据类型的快速转换
        Integer i3=55;
        System.out.println(i3);
//        自动拆箱
        int i4=i3;
        System.out.println(i4);
        System.out.println(i1.equals(i3));
        System.out.println(i1==i3);
        System.out.println(i1.compareTo(i3)); //return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}
