package com.panpan.internet;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author panpan
 * @create 2024-09-09-上午 11:09
 */
public class ObjectSocket {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("169.254.239.110",8181);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入");
        String password = sc.nextLine();
        User user=new User(name,password);

        OutputStream out=s.getOutputStream();
        ObjectOutputStream dos=new ObjectOutputStream(out);
//        DataOutputStream dos=new DataOutputStream(out);
        dos.writeObject(user);

        InputStream input=s.getInputStream();
        DataInputStream dis=new DataInputStream(input);
        boolean flag = dis.readBoolean();
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }



        dis.close();
        input.close();
        dos.flush();
        dos.close();
        out.close();
        s.close();
    }
}

class Serveredocket{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        java.net.ServerSocket ss=new java.net.ServerSocket(8181);
        Socket s=ss.accept();
        InputStream input=s.getInputStream();
        ObjectInputStream dis=new ObjectInputStream(input);
        User user= (User) dis.readObject();
        boolean flag=false;
        if (user.getName().equals("panpand")&&user.getPwd().equals("123456")){
            flag=true;
//            System.out.println("登录成功");
//        }else {
//            System.out.println("登录失败");
        }

        OutputStream out=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(out);
        dos.writeBoolean(flag);


        dos.flush();
        dos.close();
        out.close();
        dis.close();
        input.close();
        s.close();

    }
}
