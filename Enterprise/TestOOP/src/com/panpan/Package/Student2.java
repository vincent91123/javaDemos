package com.panpan.Package;

/**
 * @author panpan
 * @create 2024-09-02-下午 01:46
 */
public class Student2 {//implements Comparable<Student2>{
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

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Student2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

/*    @Override
    public int compareTo(Student2 o) {
        return (this.getName()).compareTo(o.getName());
    }*/
}
