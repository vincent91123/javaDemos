package com.panpan.files;

import java.io.Serializable;

/**
 * @author panpan
 * @create 2024-09-05-下午 02:59
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -8766212332996801343L;
    String name;
    int age;

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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
