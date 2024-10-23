package com.panpan.files;

import java.io.*;

/**
 * @author panpan
 * @create 2024-09-04-下午 03:32
 */
public class FileException {
    public static void main(String[] args) {
        File filer=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginss.txt");
        File filew=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginssw.txt");

        FileReader reader=null;
        FileWriter writer= null;
        try {
            writer = new FileWriter(filew,false);
            reader=new FileReader(filer);
            char[] ch=new char[5];
            int len=reader.read(ch);
            while (len!=-1){
                String s=new String(ch);
                writer.write(s);
                len=reader.read(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (writer!=null) {
                    writer.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (writer!=null) {
                    reader.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }




    }
}
