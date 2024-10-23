package com.panpan.Package;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author panpan
 * @create 2024-09-02-上午 10:12
 */
public class TreeSets {
    public static void main(String[] args) {
        /*Comparator<Student> comparator2 = new Compara3();
        TreeSet<Student> treeSet = new TreeSet<>(comparator2);*/
        TreeSet <Student> treeSet = new TreeSet<>(new Compara4(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        treeSet.add(new Student("panpan33", 18, 50.88));
        treeSet.add(new Student("panpan22", 28, 30.88));
        treeSet.add(new Student("panpan88", 48, 20.88));
        treeSet.add(new Student("panpan00", 58, 10.88));
        treeSet.add(new Student("panpan54", 118, 56.88));
        System.out.println(treeSet.size());
        System.out.println(treeSet);
 /*       TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(10);
        System.out.println(treeSet.size());
        System.out.println(treeSet);*/
    }
}
