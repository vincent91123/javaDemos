package com.panpan.Package;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

/**
 * @author panpan
 * @create 2024-08-30-上午 08:07
 */
public class Vectors{
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<String>();
        list.add("panpan");
        list.add("laoliu");
        list.add("chunjie");
        list.add("fangfang");
/*        list.add(123);
        list.add(22.056);*/

/*        for (Object  i : list){
            System.out.print(i+"\t");
        }*/
        for (String s : list){
            System.out.print(s+"\t");
        }
    }
}
