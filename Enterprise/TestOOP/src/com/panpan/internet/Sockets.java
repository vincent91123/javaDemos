package com.panpan.internet;


import java.io.*;
import java.net.Socket;

/**
 * @author panpan
 * @create 2024-09-09-上午 09:53
 */
public class Sockets {


    public static void main(String[] args) throws IOException {
        Socket s=new Socket("169.254.239.110",8181);
        OutputStream out=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(out);
        dos.writeUTF("hello");

        InputStream input=s.getInputStream();
        DataInputStream dis=new DataInputStream(input);
        String s1 = dis.readUTF();
        System.out.println(s1);


        dis.close();
        input.close();
        dos.flush();
        dos.close();
        out.close();
        s.close();
    }
}

class ServerSocket{
    public static void main(String[] args) throws IOException {
        java.net.ServerSocket ss=new java.net.ServerSocket(8181);
        Socket s=ss.accept();
        InputStream input=s.getInputStream();
        DataInputStream dis=new DataInputStream(input);
        String s1 = dis.readUTF();
        System.out.println(s1);



        dis.close();
        input.close();
        s.close();

    }
}
