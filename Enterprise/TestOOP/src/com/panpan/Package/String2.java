package com.panpan.Package;

/**
 * @author panpan
 * @create 2024-08-28-上午 11:18
 */
public class String2 {
    public static void main(String[] args) {
        StringBuilder sb2=new StringBuilder("panpan");
        sb2.append("hello");
        System.out.println(sb2);

        sb2.delete(3,6);
        System.out.println(sb2);

        sb2.deleteCharAt(5);
        System.out.println(sb2);

        StringBuilder sb3=new StringBuilder("define");
        sb3.insert(3," ");
        System.out.println(sb3);

        sb3.insert(3,",,");
        System.out.println(sb3);
        StringBuilder sb4=new StringBuilder("panpan4dafdaf");
        sb4.replace(3,5,"panpan5");
        System.out.println(sb4);

        for (int i = 0; i < sb4.length(); i++) {
            System.out.print(sb4.charAt(i)+"\t");
        }
        System.out.println();

        System.out.println(sb4.substring(2,4));








/*



















       StringBuilder sb=new StringBuilder("panpan");

        System.out.println(sb.append("hello").append("4545").toString());

        String ss="panpan";
        ss="hello";
        System.out.println(ss);
        System.out.println(sb.append("aaa")==sb.append("bbb"));

        */
    }
}
