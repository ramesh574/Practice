package com.company;

import java.util.Scanner;

public class splitString {
    public static void main(String[] args) {
        String s="java is,a,good,language, for ,programming";
        String [] a=s.split("@");
        for(String n:a)
            System.out.println(n);
              /* int i;
        while(( i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }*/
               /* FileReader fr= new FileReader("/home/rameshkumar/Downloads/archive/matches.csv");
        BufferedReader br=new BufferedReader(fr);
         String s;
         while((s= br.readLine())!=null)
         {
             System.out.print(s);
         }
         br.close();*/
     /*   Scanner sc=new Scanner(fr);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }*/
        //
    }
}
