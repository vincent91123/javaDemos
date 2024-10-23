package com.panpan.files;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * @author panpan
 * @create 2024-09-05-上午 09:55
 */
public class Scann {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        File file = new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginww.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        String ss = br.readLine();
        while (!ss.equals("exit")) {
            bw.write(ss);
            bw.newLine();
            ss = br.readLine();
        }
        bw.close();
        br.close();

    }
/*    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        InputStreamReader fis=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(fis);

        File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\loginww.txt");
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        String ss=br.readLine();
        while (!ss.equals("exit")){
            bw.write(ss);
            bw.newLine();
            ss=br.readLine();
        }
        bw.close();
        br.close();



        
    }*/
    
    /*    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        int i=in.read();
        System.out.println(i);

        Scanner scanner=new Scanner(System.in);
        String sc=scanner.next();
        System.out.println(sc);

        Scanner scanner1=new Scanner(new FileInputStream(new File("C:\\Users\\ZX-PAN\\Desktop\\hello\\login.txt")));
        while (scanner1.hasNext()){
            System.out.print(scanner1.next());
        }

    }*/
}
