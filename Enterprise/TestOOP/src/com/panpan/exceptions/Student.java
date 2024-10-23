package com.panpan.exceptions;

/**
 * @author panpan
 * @create 2024-08-23-下午 01:45
 */
public class Student {
    int age;
    String name;
    char sex;

    public Student() {
    }

    public Student(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
//        this.sex = sex;
        if (sex == '男' || sex == '女') {
            this.sex = sex;
        } else {
            throw new MyException("连个性别都输不清楚，笨蛋");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
