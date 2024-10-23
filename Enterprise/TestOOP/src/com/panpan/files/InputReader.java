package com.panpan.files;

import java.io.*;

/**
 * @author panpan
 * @create 2024-09-05-上午 09:27
 */
public class InputReader {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        File filer=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\login.txt");
        File filew=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginssw.txt");
        FileInputStream fis=new FileInputStream(filer);
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
        FileOutputStream fos=new FileOutputStream(filew);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
        char[] chars=new char[1024*10];
        long start=System.currentTimeMillis();
        int len=0;
        try {
            while ((len=isr.read(chars))!=-1){
                osw.write(chars,0,len);
                len= isr.read(chars);
            }
            long end=System.currentTimeMillis();
            System.out.println("time:"+(end-start));
            osw.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\login.txt");
        FileInputStream fis=new FileInputStream(file);
        InputStreamReader isr=new InputStreamReader(fis,"utf-8");
        char[] chars=new char[1024];
        long start=System.currentTimeMillis();
        int len=0;
        while ((len=isr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
            len= isr.read(chars);
        }
        long end=System.currentTimeMillis();
        System.out.println("time:"+(end-start));
        isr.close();

    }*/
}
