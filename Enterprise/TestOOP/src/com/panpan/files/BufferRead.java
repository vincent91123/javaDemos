package com.panpan.files;

import java.io.*;

/**
 * @author panpan
 * @create 2024-09-05-上午 09:08
 */
public class BufferRead {

/*    public static void main(String[] args) throws IOException {
        File filer=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\login.txt");
        File filew=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginssw.txt");
        FileReader reader=new FileReader(filer);
        FileWriter writer=new FileWriter(filew,false);
        BufferedReader  br=new BufferedReader(reader);
        BufferedWriter  bw=new BufferedWriter(writer);
        long start=System.currentTimeMillis();
        char[] ch=new char[10];
        int len=br.read(ch);
        while(len!=-1){
            writer.write(len);
            len=br.read();
        }
        long end=System.currentTimeMillis();
        System.out.println("用时为："+(end-start));
        bw.close();
        br.close();


    }*/
    public static void main(String[] args) throws IOException {
        File filer=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\login.txt");
        File filew=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginssw.txt");
        FileReader reader=new FileReader(filer);
        FileWriter writer=new FileWriter(filew,false);
        BufferedReader bufferedReader=new BufferedReader(reader);
        BufferedWriter  bw=new BufferedWriter(writer);
        long start=System.currentTimeMillis();
        String line=bufferedReader.readLine();
        while (line!=null){
            writer.write(line);
            writer.write("\r\n");
            line=bufferedReader.readLine();
        }
        long end=System.currentTimeMillis();
        System.out.println("用时为："+(end-start));
        writer.close();
        bufferedReader.close();
    }
}
