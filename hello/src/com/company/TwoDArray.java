package com.company;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][4];
        System.out.print("enter arrays");
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("printed array");
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]);
            }
        }


    }
}
