package com.panpan.Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author panpan
 * @create 2024-09-03-上午 08:08
 */
public class HashMapss {
    public static void main(String[] args) {
        ArrayList<String> aa=new ArrayList<>();
        aa.add("ee");
        aa.add("ff");
        aa.add("gg");
        aa.add("hh");
        aa.add("bb");
        aa.add("cc");
        aa.add("dd");
        System.out.println("第一次："+aa);
        Collections.addAll(aa,"rr","tt","yy");
        System.out.println("第二次："+aa);
        Collections.addAll(aa,new String[]{"nn","mm","zz"});
        System.out.println("第三次："+aa);

        Collections.sort(aa);
        System.out.println("排序后的次："+aa);
        System.out.println(Collections.binarySearch(aa,"ee"));
//      倒序咋办呢

//      copy是直接替换哈
        ArrayList<String> bb=new ArrayList<>();
        bb.add("panpan");
        bb.add("yanyan");
        Collections.copy(aa,bb);
        System.out.println(aa);
        System.out.println(bb);
//        填充函数
        ArrayList<String> cc=new ArrayList<>();
        cc.add("benci");
        cc.add("lake");
        cc.add("lincon");
        Collections.fill(cc,"bmw");
        System.out.println(cc);
//        填充函数
/*        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "audi");
        hs.put(2, "auto");
        hs.put(3, "bmw");
        hs.put(4, "benci");
        hs.put(5, "jeep");
        hs.put(6, "kadilake");
        hs.put(7, "aerfa");
        System.out.println(hs.size());
        System.out.println(hs);*/

    }
}
