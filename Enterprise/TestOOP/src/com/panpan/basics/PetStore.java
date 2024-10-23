package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-22-上午 11:55
 */
public class PetStore {

    public static Animal getAnimal(String petName){
        Animal an=null;

        if ("cat".equals(petName)){
            an=new Cat();
        }
        if ("dog".equals(petName)){
            an=new Dog();
        }
        if ("pig".equals(petName)){
            an=new Pig();
        }
        return an;
    }
}
