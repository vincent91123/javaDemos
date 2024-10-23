package com.panpan.Package;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author panpan
 * @create 2024-09-02-下午 01:41
 */
public class TreeMaps {
    public static void main(String[] args) {
        Map<Student2,Integer> map=new TreeMap<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return ((Double)(o1.getHeight())).compareTo((Double)(o2.getHeight()));
            }
        });

        map.put(new Student2("panpan",13,180.24),10086);
        map.put(new Student2("panp",12,140.25),10025);
        map.put(new Student2("panpa",17,145.14),15214);
        map.put(new Student2("pa",12,156.25),52421);
        map.put(new Student2("panpad",12,180.56),10585);
        for (Map.Entry<Student2,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }




    }
}
