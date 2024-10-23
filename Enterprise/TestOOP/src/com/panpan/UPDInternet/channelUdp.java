package com.panpan.UPDInternet;

import com.panpan.files.Scann;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author panpan
 * @create 2024-09-10-上午 08:21
 */
public class channelUdp {
    public static void main(String[] args){
        System.out.println("学生上线。。。");
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(8282);
            while(true){
                Scanner sc=new Scanner(System.in);
                System.out.print("学生：");
                String str=sc.next();
                if(str.equals("byebye")){
                    System.out.println("学生已经下线.");
                    break;
                }
                byte[] datas=str.getBytes();
                DatagramPacket dp=new DatagramPacket(datas,datas.length, InetAddress.getByName("localhost"),9999);

                ds.send(dp);

//        接受消息了
                byte[] data = new byte[1024];
                DatagramPacket dp2 = new DatagramPacket(data, data.length);
                ds.receive(dp2);
                byte[] datas2 = dp2.getData();
                String s= new String(datas2,0,dp2.getLength()); //
                System.out.println("收到了老师的消息："+s);
            }

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(ds!=null){
                ds.close();
            }
        }
    }
}


class  channelUdpTeacher{
    public static void main(String[] args) {
        System.out.println("老师上线。。。");
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(9999);
            while (true) {
                byte[] data = new byte[1024];
                DatagramPacket dp = new DatagramPacket(data, data.length);

                ds.receive(dp);
                byte[] datas = dp.getData();
                String s= new String(datas,0,dp.getLength()); //
                System.out.println("收到了学生的消息："+s);
                if (s.equals("byebye")) {
                    System.out.println("学生已经下线，老师也下线");
                    break;
                }

//      老师进行回复
                Scanner sc=new Scanner(System.in);
                System.out.print("老师：");
                String str=sc.next();
                byte[] datas2=str.getBytes();
                DatagramPacket dp2=new DatagramPacket(datas2,datas2.length,dp.getAddress(),dp.getPort());
                ds.send(dp2);
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(ds!=null){
                ds.close();
            }
        }
    }
}
