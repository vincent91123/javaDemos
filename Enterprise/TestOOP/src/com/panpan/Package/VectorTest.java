package com.panpan.Package;

/**
 * @author panpan
 * @create 2024-08-30-上午 08:36
 */
public class VectorTest<E> {
    int age;
    String name;
    E sex;

    public void a(E sex){

    }
    public void b(E[] sexs){

    }


}

class VectorTest1<E> {
    public static void main(String[] args) {
//        没有指定泛型，默认为object对象
        VectorTest  vt = new VectorTest();
        vt.a(1);
        vt.a("cc");
        vt.b(new String[]{"1","3","44","56","panpan","laoliu"});

//        泛型实例化
        VectorTest<String>  vt2 = new VectorTest<String>();
        vt2.name="panpanvt2";
        vt2.a("panpan");
        vt2.b(new String[]{"panpanvt2","laoliuvt2"});


    }
        
    }
class VectorSun extends VectorTest<Integer>{
    
}


class demo{
    public static void main(String[] args) {
//        指定父类泛型，那么子类就不需要指定泛型了
        VectorSun sun=new VectorSun();
        sun.a(19);
    }
}

class VectorSun2<E> extends VectorTest<E>{ //如果子类和父类都未指定泛型，那可以在使用的时候指定泛型

}
class demo2{
    public static void main(String[] args) {
        VectorSun2<String> sun2=new VectorSun2<String>();
        sun2.a("panpansun2 ");
    }
}

