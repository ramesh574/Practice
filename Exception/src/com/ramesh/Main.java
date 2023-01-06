package com.ramesh;

        import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.FileReader;
        import java.util.ArrayList;
        import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
     /*   FileReader fr = new FileReader("/home/rameshkumar/Downloads/archive/matches.csv");
        BufferedReader br = new BufferedReader(fr);
        String s;
        ArrayList<String> lines = new ArrayList<>();
        while ((s = br.readLine()) != null) {
            // System.out.println(s);
            lines.add(s);
        }
        ArrayList<String[]> recoreds = new ArrayList<>();
        lines.forEach(E -> {
            recoreds.add(E.split(","));
        });
        recoreds.forEach((E -> {
            for (var i : E) {
                System.err.print(i + " | ");
            }
            System.out.println();
        }));
        br.close();
    }*/
        //this code for reading the data from to computer program
      /*  FileOutputStream fr=new FileOutputStream("/home/ramesh/IdeaProjects/Exception/rms.text");
        String s ="this is java programming";
       // fr.write(s.getBytes());
        byte b[]=s.getBytes();
         fr.write(b ,8,15);
        fr.close();*/

        //this code for reading the data from to file
        /*FileInputStream fr=new FileInputStream("/home/ramesh/IdeaProjects/Exception/man.text");
        byte[] b=new byte[fr.available()];
        fr.read(b);
        String s=new String(b);
        System.out.println(s);*/
       /* FileInputStream fr=new FileInputStream("/home/ramesh/IdeaProjects/Exception/man.text");
        FileOutputStream fw=new FileOutputStream("/home/ramesh/IdeaProjects/Exception/rms.text");
        int b;
        while((b= fr.read())!=-1)
        {
            if(b>=65&&b<=90)
                fw.write(b+32);
            else
                fw.write(b);
        }
        fr.close();
        fw.close();*/
      /*  FileInputStream fr=new FileInputStream("/home/ramesh/IdeaProjects/Exception/man.text");
        FileInputStream fs=new FileInputStream("/home/ramesh/IdeaProjects/Exception/rms.text");
        FileOutputStream fo=new FileOutputStream("/home/ramesh/IdeaProjects/Exception/designation.text");
        SequenceInputStream sis=new SequenceInputStream(fr,fs);
        int b;
        while((b=sis.read())!=-1) {/home/ramesh/IdeaProjects/Exception/rms.text"
            fo.write(b);
        }
        fr.close();
        fs.close();
        fo.close();
        sis.close();*/
       // byte b[]={'a','b','c','d','e','f'};
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
       /* int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        String s=new String((bis.readAllBytes()));
        System.out.println(bis.markSupported());*/
        bos.write('a');
        bos.write('b');
        bos.write('c');
        /*byte b[]= bos.toByteArray();
        for(byte x:b)
        {
            System.out.println((char )x);
        }
        bos.writeTo(new FileOutputStream("/home/ramesh/IdeaProjects/Exception/rms.text"));*/
      //  char ch[]={'a','b','c','d','e','f'};
       // CharArrayReader cr=new CharArrayReader(ch);
        CharArrayWriter cw=new CharArrayWriter(5);
        cw.write('a');
        cw.write('b');
        cw.write('c');
        cw.write('d');
        char ch[]= cw.toCharArray();
        for(char c:ch)
        {
            System.out.print( c);
        }
       /* int x;
        while((x= cr.read())!=-1)
        {
            System.out.print((char)x);
        }
        bos.close();*/
    }
}




