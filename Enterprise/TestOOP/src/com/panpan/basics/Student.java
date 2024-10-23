package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-19-下午 02:51
 */
public class Student extends person {
    String  name;
    private int age;
    static  String school;

    double Score;
    public Student(){

    }




    public Student(double score){
        super();
        this.Score=score;
    }

    /*
    * 1.如果构造器已经显示的调用super(),第一行就没有默认的空super()了
    * 2.this()和super()都必须调用在第一行呢,所以只能二选一哈
    *
    * */
    public Student(double score,String name,int age){
        super(name,age);
//        this.score=score;
    }

    public void study(){
        System.out.println("学生需要学习的");
    }

    public void showa(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(school);

        System.out.println("----------------showb");
    }
    public static void showb(){

//        System.out.println(name);不可在静态方法中调用静态方法
//        System.out.println(age); 不可在静态方法中嗲用静态属性
        System.out.println(school);
        System.out.println("----------------showb");
    }

    public int getAge(){
        return age;
    }
    public void shezhiage(int age){
        this.age=age;
    }





    public static void main(String[] args) {
        Student.school="苏州大学";

        Student s1 = new Student();
        s1.name = "panpan";
        s1.age=18;
        s1.showa();
        s1.showb();

        Student.showb();
        showb();

        Student s2 = new Student();
        s2.name = "panpan2";
        s2.age=188;

        System.out.println(s1.school);
        System.out.println(s2.school);



    }
}
