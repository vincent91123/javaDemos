package com.panpan.files;

import java.io.*;

/**
 * @author panpan
 * @create 2024-09-04-下午 03:57
 */
public class StreamInput {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        FileInputStream in=new FileInputStream(file);
        byte[] bytes=new byte[1024*8];
        int data=in.read(bytes);
        while (data!=-1){
            for (int i = 0; i < data; i++) {
                System.out.print(bytes[i]+"\t");
            }
            data=in.read();
        }
        in.close();
    }
/*    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZX-PAN\\Pictures\\loginbg.png");
        FileInputStream in=new FileInputStream(file);
        int data=in.read();
        int count=0;
        while (data!=-1){
            count++;
            System.out.print(data+"\t");
            data=in.read();
        }
        System.out.println("count:"+count);
        in.close();
    }*/
   /* public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        FileInputStream in=new FileInputStream(file);
        int data=in.read();
        while (data!=-1){
            System.out.print(data+"\t");
            data=in.read();
        }
        in.close();
    }*/
}
