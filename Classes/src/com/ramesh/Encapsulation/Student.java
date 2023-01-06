package com.ramesh.Encapsulation;

public class Student {
    private int value;
    public Student( int x)
    {
        value=x;
    }

//    public void setValue(int x) {
//        value=x;
//    }

    public int getValue() {
        return value;
    }
}
class Test{
    public static void main(String[] args) {
        Student s=new Student(123);
        // s.setValue(97600);
        System.out.println(s.getValue());

    }
}
