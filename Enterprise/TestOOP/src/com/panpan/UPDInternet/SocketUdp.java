package com.panpan.UPDInternet;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.net.*;

/**
 * @author panpan
 * @create 2024-09-09-下午 04:41
 */
public class SocketUdp {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线。。。");
        DatagramSocket ds =new DatagramSocket(8282);
        java.lang.String str="hello";
        DatagramPacket dp=new DatagramPacket(new byte[1024],1024, InetAddress.getByName("localhost"),8282);

        ds.send(dp);
        ds.close();
    }
}

class Teacher {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线。。。");
        DatagramSocket ds = new DatagramSocket(8282);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        ds.receive(dp);
        byte[] data = dp.getData();
        java.lang.String s= new java.lang.String(data,0,dp.getLength());
        System.out.println("收到了学生的消息："+s);
        ds.close();
    }
}
