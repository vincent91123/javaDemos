package com.panpan.Package;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author panpan
 * @create 2024-08-28-下午 03:23
 */
public class Lists {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("panpan");
        list.add("forever");
        System.out.println(list);

        list.add(3, "panpan love beauty");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println("--------------------");
        list.remove(4);
        for (Object o:list) {
            System.out.print(o+"\t");
        }
        System.out.println();
        list.set(5,77);
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+"\t");
        }

        ArrayList list1 =new ArrayList();
        list1.add("panpan");





    }
}
