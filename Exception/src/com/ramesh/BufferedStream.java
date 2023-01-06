package com.ramesh;
import java.io.*;
public class BufferedStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("/home/ramesh/IdeaProjects/Exception/rms.text");
        BufferedInputStream bis=new BufferedInputStream(fis);
       /* int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char) x);
        }*/
       /* System.out.println("File"+fis.markSupported());
        System.out.println("Buffer"+bis.markSupported());*/
        /*System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());*/
        FileReader fr=new FileReader("/home/ramesh/IdeaProjects/Exception/rms.text");
        BufferedReader br=new BufferedReader(fr);



    }
}
