package com.panpan.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author panpan
 * @create 2024-09-03-下午 03:13
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {
        File filer=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        File filew=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginssw.txt");
        FileWriter  writer=new FileWriter(filew,false);
        FileReader reader=new FileReader(filer);
        char[] ch=new char[5];
        long startTime=System.currentTimeMillis();
        int len=reader.read(ch);
        while (len!=-1){
            String s=new String(ch);
            writer.write(s);
            len=reader.read(ch);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(startTime-endTime);

        writer.close();
        reader.close();

    }

    /* 第一种：
    * char[] chars = new char[1024];
        int len;//=reader.read();
        while ((len=reader.read(chars))!=-1){
            writer.write(chars,0,len);
            len = reader.read();
        } */

     /* 第二种：
    * char[] chars = new char[1024];
        int len;//=reader.read();
        while ((len=reader.read(chars))!=-1){
            writer.write(chars,0,len);
            len = reader.read();
        } */

    /* 第三种：
    * char[] chars = new char[1024];
        int len;//=reader.read();
        while ((len=reader.read(chars))!=-1){
            writer.write(chars,0,len);
            len = reader.read();
        } */

    /* 第四种：
    * char[] chars = new char[1024];
        int len;//=reader.read();
        while ((len=reader.read(chars))!=-1){
            writer.write(chars,0,len);
            len = reader.read();
        } */


/*    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        FileWriter  writer=new FileWriter(file,false);//filerWriter(file,true)等于是直接覆盖；filerWriter(file,false)等于是在原先的文件上追加
        String ss="hello world22";
        char[] chars = ss.toCharArray();
        writer.write(chars);
*//*        String ss="hello world22";
        for (int i = 0; i < ss.length(); i++) {
            writer.write(ss.charAt(i));
        }*//*

        writer.close();
    }*/
}
