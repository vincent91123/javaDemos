package com.panpan.Package;

import java.util.*;

/**
 * @author panpan
 * @create 2024-08-28-下午 02:01
 */
public class Collections {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        List  list = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10});
        list.add(3,66);
        col.addAll(list);
        col.add(18);
        col.add(19);
        col.add(20);

        System.out.println(col);
        String ss = col.toString();
//        1,
//        for (int i = 0; i < ss.length(); i++) {
//            System.out.println(ss.get(i));
//        }

        for (Object  i : col){
            System.out.print(i+"\t");
        }

        System.out.println();
        Iterator it=col.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }

/*        Collection col2 = new ArrayList();
        col.add(18);
        col.add(19);
        col.add(20);
        System.out.println(col);

        List  list = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(list);
        col.addAll(list);
        System.out.println(col);
//        col.clear();
        System.out.println(col.size());
        System.out.println(col.isEmpty());
        System.out.println(col.equals(col2));
        System.out.println(col==col2);
        System.out.println(col.contains(18));*/

    }
}
