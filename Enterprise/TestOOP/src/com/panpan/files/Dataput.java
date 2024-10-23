package com.panpan.files;

import java.io.*;

/**
 * @author panpan
 * @create 2024-09-05-上午 11:23
 */
public class Dataput {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt")));
//        while (ois.readObject()!=null){
            System.out.println(ois.readObject());
//        }

        ois.close();
    }

/*    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt")));
        oos.writeObject(new Person("panpan",23));
        oos.close();
    }*/

/*
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt")));
        while (ois.readObject()!=null){
            System.out.println(ois.readObject());
        }

        ois.close();
    }
*/

/*    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt")));
        oos.writeObject("panpan");
        oos.writeObject(123456);
        oos.writeObject(false);
        oos.writeObject(100);
        oos.writeObject(56.23);
        oos.writeObject(null);
        oos.close();
    }*/



/*    public static void main(String[] args) throws IOException {
        *//*File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt");
        FileOutputStream fos=new FileOutputStream(file);
        DataOutputStream  dos=new DataOutputStream(fos);*//*
        DataOutputStream  dos=new DataOutputStream(new FileOutputStream(new  File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt")));
        dos.writeUTF("123456");
        dos.writeBoolean(false);
        dos.writeInt(100);
        dos.writeDouble(56.23);


        dos.close();


    }*/

/*    public static void main(String[] args) throws IOException {
        DataInputStream dis=new DataInputStream(new FileInputStream(new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginrr.txt")));
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        dis.close();
    }*/
}
