package com.ramesh;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i=0;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }

}