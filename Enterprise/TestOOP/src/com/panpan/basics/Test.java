package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-19-上午 11:29
 */
public class Test {
    public static void main(String[] args) {

        Human hu=new Human();


//        Animal an=new Pig();
        Animal an=PetStore.getAnimal("cat");
        hu.play(an);
//        hu.play(dog);

/*        Boy b = new Boy( 19,"panpan");
        Girl g = new Girl("YANYAN",20);

        g.add(50);
        g.love(b);*/

/*     Phone phone1=new Phone(2015,5626.00,"iphone");
     Phone phone2=new Phone(2015,5626.00,"iphone");


     System.out.println(phone1.equals(phone2));

     doctor d=new doctor();
     d.weight();
     System.out.println(d.toString());*/




/*       person p =   new person();
        p.age=19;
        p.name="panpan";
        p.height=170;

        Student s = new Student();
//        s.age=15;
        s.shezhiage(25);
        System.out.println(s.getAge());

        Student s2 = new Student();
        s2.shezhiage(15);
        s2.setName("panpan");
        s2.setHeight(80);
        System.out.println(""+s2.getAge()+s2.getName()+s2.getHeight());

        s2.eat();
        s2.study();*/


    }
}
