package com.panpan.internet;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author panpan
 * @create 2024-09-09-下午 01:45
 */
public class ObjectException {
    public static void main(String[] args)  {
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

class ServeredSocket{
    public static void main(String[] args){
        java.net.ServerSocket ss= null;
        Socket s=null;
        InputStream input=null;
        ObjectInputStream dis=null;
        OutputStream out=null;
        DataOutputStream dos=null;
        try {
            ss = new java.net.ServerSocket(8181);
            s=ss.accept();
            input=s.getInputStream();
            dis=new ObjectInputStream(input);
            User user= (User) dis.readObject();
            boolean flag=false;
            if (user.getName().equals("panpand")&&user.getPwd().equals("123456")){
                flag=true;
            }

            out=s.getOutputStream();
            dos=new DataOutputStream(out);
            dos.writeBoolean(flag);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (dos!=null) {
                    dos.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (dos!=null) {
                    dos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (dis!=null) {
                    dis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (input!=null) {
                    input.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (s!=null) {
                    s.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }





    }
}
