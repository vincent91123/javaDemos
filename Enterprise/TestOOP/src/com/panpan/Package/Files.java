package com.panpan.Package;

import java.io.File;
import java.io.IOException;

/**
 * @author panpan
 * @create 2024-09-03-上午 11:16
 */
public class Files {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ZX-PAN\\Desktop\\hello"); //loginss.txt
        File f1=new File("c:"+File.separator+"Users"+File.separator+"ZX-PAN"+File.separator+"Desktop"+File.separator+"hello"+File.separator+"loginss.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getTotalSpace());
        System.out.println(file.toString());
        System.out.println("++++++++========================================================================");
        System.out.println(f1.getName());
        System.out.println(f1.canWrite());
        System.out.println(f1.isFile());
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.isFile());
        System.out.println(f1.canRead());
        System.out.println(f1.getPath());
        System.out.println(f1.getParent());
        System.out.println(f1.getTotalSpace());
        f1.mkdir();//创建单层文件夹
        f1.mkdirs();//创建多层文件夹
        f1.delete();//删除文件夹,如果文件夹不为空，则不会删除文件夹内的文件，，为空直接删除
        System.out.println("++++++++========================================================================");
        String[] ss=file.list();
        for (String s : file.list()) {
            System.out.println(s);
        }
        System.out.println("++++++++========================================================================");
        for (File files:file.listFiles()){
            System.out.println(files);
        }


/*        if (f1.exists()) {
            f1.delete();
        }else{

            System.out.println("文件不存在");
            f1.createNewFile();
        }*/
    }
}
