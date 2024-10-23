package com.panpan.Package;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author panpan
 * @create 2024-09-02-上午 08:52
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(Student o) {
//        return this.getAge()-o.getAge();
        return this.getAge()-(o.getAge());
    }
}

class Compara implements Comparator<Student> {

    @Override
    public int compare(Student o1,Student o2) {
        return o1.getAge()-o2.getAge();
    }
}

class Compara2 implements Comparator<Student> {

    @Override
    public int compare(Student o1,Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Compara3 implements Comparator<Student> {

    @Override
    public int compare(Student o1,Student o2) {
        if (o1.getAge()-o2.getAge()==0){
            return ((Double)o1.getHeight()).compareTo((Double)o2.getHeight());
        }else {
            return o1.getName().compareTo(o2.getName());
        }

    }
}

class Compara4 implements Comparator<Student> {

    @Override
    public int compare(Student o1,Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
