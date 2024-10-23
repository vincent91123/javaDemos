package com.panpan.internet;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author panpan
 * @create 2024-09-09-下午 03:55
 */
public class ObjectThread {
    public static void main(String[] args)  {

        System.out.println("欢迎使用panpan客户端：8181");
        Socket s= null;
        OutputStream out=null;
        ObjectOutputStream dos=null;
        DataInputStream dis=null;
        InputStream input=null;
        try {
            s = new Socket("169.254.239.110",8181);
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入");
            String password = sc.nextLine();
            User user=new User(name,password);

            out=s.getOutputStream();
            dos=new ObjectOutputStream(out);
//        DataOutputStream dos=new DataOutputStream(out);
            dos.writeObject(user);

            input=s.getInputStream();
            dis=new DataInputStream(input);
            boolean flag = dis.readBoolean();
            if (flag){
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }
        } catch (IOException e) {
//                throw new RuntimeException(e);
            try {
                if (dis!=null){
                    dis.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                if (input!=null){
                    input.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                if (dos!=null){
                    dos.flush();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                if (dos!=null){
                    dos.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                if (out!=null){
                    out.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                if (s!=null) {
                    s.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

class ServereSocket{
    public static void main(String[] args){
        System.out.println("欢迎使用panpan服务器:8181");
        java.net.ServerSocket ss= null;
        Socket s=null;
        int count=0;
        try {
            ss = new java.net.ServerSocket(8181);
            while(true){
                s = ss.accept();
                new ServerThread(s).start();
                count++;
                System.out.println("这个是第"+count+"个用户使用panpan服务器"+s.getInetAddress());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

