package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws Exception
    {
         FileReader fr=new FileReader("/home/rameshkumar/Downloads/archive/matches.csv");
         int i;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }


         //br.close();

                
    }
}
