package com.ramesh.inheritance;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s = new Student(1, "ramesh", "basti", 989789.989);
        System.out.println(s.getName());
    }
}
