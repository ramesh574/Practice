package com.ramesh;

import java.io.FileOutputStream;
import java.io.PrintStream;
class Student {
    int rollno;
    String name;
    String dept;
}

public class PrintStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D:/Documents/DockerCommands.txt"); // Fix the path and filename
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        s.dept = "CSE";

        // Write the student data to the file
        ps.println("Roll No: " + s.rollno);
        ps.println("Name: " + s.name);
        ps.println("Department: " + s.dept);

        ps.close();
        fos.close();
    }
}

