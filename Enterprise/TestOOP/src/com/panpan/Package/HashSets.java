package com.panpan.Package;

import java.util.Comparator;
import java.util.HashSet;

/**
 * @author panpan
 * @create 2024-09-02-上午 08:44
 */
public class HashSets {
    public static void main(String[] args) {
        HashSet<Student>  hashSet = new HashSet<>();
        hashSet.add(new Student("panpan",12));
        hashSet.add(new Student("panpan3",15));
        hashSet.add(new Student("panpan4",16));
        hashSet.add(new Student("panpan7",183));
        hashSet.add(new Student("panpan1",122));
        hashSet.add(new Student("panpan00",125));
        hashSet.add(new Student("panpan43",33));
        hashSet.add(new Student("panpan99",15));
        System.out.println(hashSet.size());
        System.out.println(hashSet);
/*        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(40);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(80);
        hashSet.add(9);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(120);
        hashSet.add(13);
        System.out.println(hashSet.size());
        System.out.println(hashSet);*/

        double a=10.6;
        double b=10.3;
        System.out.println(a-b);
        String aa="A";
        String bb="B";
        System.out.println(aa.compareTo(bb));
        System.out.println((int)(a-b));

        Student student1=new Student("panpan",12,50.25);
        Student student2=new Student("yayan",15,40.25);
        Comparator com=new Compara();
        System.out.println(com.compare(student1,student2));

//        System.out.println(student1.compareTo(student2));



    }
}
