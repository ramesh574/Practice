package com.company;
import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {4, 7, 2, 5, 3};
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j =0; j < a.length-1; j++)
            {
                if (a[j] > a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);

    }
}
