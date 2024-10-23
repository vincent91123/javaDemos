package com.panpan.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author panpan
 * @create 2024-09-03-下午 01:47
 */
public class FileRead {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        FileReader fr=new FileReader(file);
        char[] chars=new char[5]; //这个就相当于一个缓冲区
        long startTime=System.currentTimeMillis();
        int len=fr.read(chars);
        while (len!=-1) {
            /*for (int i = 0; i < len; i++) {  //chars.length 这个是不对的
                System.out.print(chars[i] + "\t");
            }*/
            String strs=new String(chars);
            System.out.print(strs);
            len=fr.read(chars);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("StreamOutput:"+(endTime-startTime));
        fr.close();
    }





/*    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        FileReader fr=new FileReader(file);
*//*        int n;
        while ((n=fr.read())!=-1){
            System.out.print((char)n+"\t");
        }*//*
//        int n=fr.read();
        while (fr.read()!=-1){
            System.out.print((char)fr.read()+"\t");//fr.read()+"\t"
        }
        System.out.println(fr.read());
        fr.close();

    }*/
}
