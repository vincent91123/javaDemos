package com.panpan.Package;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;
/**
 * @author panpan
 * @create 2024-08-27-上午 11:19
 */
public class Maths {
    public static void main(String[] args) {

        String str="abcd";
        System.out.println(str);
        String str2="a";

        String s1=new String();
        String s2=new String(new char[]{'a','b','c'});
        System.out.println(s2.length());
        System.out.println(s1.isEmpty());
        System.out.println(s2.charAt(2));
        System.out.println(s1.equals(s2));

        String str3="bckerfkerdd";
        System.out.println(str3.compareTo(str2));
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3,4));
        System.out.println(str3.concat(str));

        System.out.println(str3.replace('k','s'));

        String str4="   e-ed-r-r-f-g-pr-pr-r  -d-g-h-b     ";
        System.out.println(Arrays.toString(str4.split("-")));

        System.out.println(str4.toUpperCase());
        System.out.println(str4.toUpperCase().toLowerCase());

        System.out.println(str4.trim());
        System.out.println(str4.toString());
        System.out.println(str4+"panpan");
/*

        Random ss=new Random(5000l);
        int a=ss.nextInt();
        System.out.println(a);
        Random ss2=new Random();
        System.out.println(ss2.nextInt());
*/

 /*       System.out.println(PI);
        System.out.println(random());
        System.out.println(floor(6.35));
        System.out.println(ceil(3.25));
        System.out.println(abs(-5));
        System.out.println(max(3,9));
        System.out.println(min(4,6));*/
    }
}
