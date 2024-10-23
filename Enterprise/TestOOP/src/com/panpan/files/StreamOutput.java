package com.panpan.files;

import java.io.*;

/**
 * @author panpan
 * @create 2024-09-04-下午 04:25
 */
public class StreamOutput {
/*    public static void main(String[] args) throws IOException {
        File in=new File("C:\\Users\\ZX-PAN\\Pictures\\loginbg.png");
        File out=new File("C:\\Users\\ZX-PAN\\Pictures\\loginbghhh.png");
        FileInputStream fis=new FileInputStream(in);
        FileOutputStream fos=new FileOutputStream(out);
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] bytes=new byte[1024*10];
        long startTime=System.currentTimeMillis();
        int len=bis.read(bytes);
        while (len!=-1){
            bos.write(bytes,0,len);
            len=fis.read(bytes);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("StreamOutput:"+(endTime-startTime));
        bos.close();
        bis.close();
    }*/

    public static void main(String[] args) throws IOException {
        File in=new File("C:\\Users\\ZX-PAN\\Pictures\\loginbg.png");
        File out=new File("C:\\Users\\ZX-PAN\\Pictures\\loginbgwww.png");
        FileInputStream fis=new FileInputStream(in);
        FileOutputStream fos=new FileOutputStream(out);
        byte[] bytes=new byte[1024*10];
        long startTime=System.currentTimeMillis();
        int len=fis.read(bytes);
        while (len!=-1){
            fos.write(bytes,0,len);
            len=fis.read(bytes);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("StreamOutput:"+(endTime-startTime));
        fos.close();
        fis.close();
    }
}
