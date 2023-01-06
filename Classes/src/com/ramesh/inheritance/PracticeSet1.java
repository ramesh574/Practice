package com.ramesh.inheritance;

public class PracticeSet1 {
    int a = 50;

    void masg() {
        System.out.println("method of super class");
    }
}

class dog extends PracticeSet1 {
    int a = 40;

    void masg() {
        System.out.println("method of sub class");

    }

    void run() {
        System.out.println("run method");
    }
}

class test {
    public static void main(String[] args) {
        dog d = new dog();
        System.out.println(d.a);
        // d.masg();
        //   d.run();
        PracticeSet1 p = new dog();
        p.masg();
        System.out.println(p.a);
    }
}
