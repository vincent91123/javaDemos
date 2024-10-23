package com.panpan.Package;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author panpan
 * @create 2024-09-02-上午 11:20
 */
public class HashMaps {
    public static void main(String[] args) {
        Map<String,Integer>  map = new HashMap<String, Integer>();
        map.put("panpan3",123);
        map.put("panpan5",223);
        map.put("panpan6",1343);
        map.put("panpan0",144534);
        map.put("panpan44",1154);
        map.put("panpan8",155);
        map.put("panpan65",1453);
        map.put("panpan22",456);
        Map<String,Integer>  map2 = new HashMap<String, Integer>();
        map2.put("panpan3",123);
        map2.put("panpan5",223);
        map2.put("panpan6",1343);
        map2.put("panpan0",144534);
        map2.put("panpan44",1154);
        map2.put("panpan8",155);
        map2.put("panpan65",1453);
        map2.put("panpan22",456);
//        map.clear();
        map.remove("panpan3");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsKey("panpan22"));
        System.out.println(map.containsValue(1343));
        System.out.println(map==map2);
        System.out.println(map.equals(map2));

        System.out.println(map2.get("panpan44"));
        System.out.println("遍历keyset（）：");
        for (String s : map2.keySet()) {
//            System.out.print(s+"\t");
            System.out.print(map.get(s)+"\t");
        }
        System.out.println("遍历values():");
        for (Integer ss : map2.values()) {
            System.out.print(ss+"\t");
        }
//
        System.out.println("这个是key+value的遍历：");
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for (Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey()+"\t"+"---------"+entry.getValue());
        }

    }
}
