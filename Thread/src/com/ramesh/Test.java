package com.ramesh;

public class Test implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            System.out.println(i+"Runnable");
            i++;
        }
    }
}
