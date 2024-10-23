package com.panpan.Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author panpan
 * @create 2024-08-31-上午 11:31
 */
public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
//        Iterator<String> it=list.iterator();
        ListIterator<String> itList=list.listIterator();
        System.out.println("itList.hasNext()的正向遍历:");
        while (itList.hasNext()){ //java.util.ConcurrentModificationException 并发异常
            if ("4".equals(itList.next())) {
                itList.add("kk");
            }

        }
        System.out.println(list);
        System.out.println("itList.hasNext()的逆向遍历:");
        while (itList.hasPrevious()){ //java.util.ConcurrentModificationException 并发异常
/*            if ("2".equals(itList.previous())) {
                itList.add("bb");

            }*/
            System.out.print(itList.previous());

        }
        System.out.println(list);
    }

}
