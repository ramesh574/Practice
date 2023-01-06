package com.ramesh.textbloack;

public class TextBlock {
    public static void main(String[] args) {
        String s = "Ramesh\n"
                + "\t\u2022 Kumar\n"
                + "\t\t\u2022 Prajapati";
        System.out.println(s);
        String st = """
                Ramesh:
                    \u2022 Kumar
                        \u2022 Prajapati
                                """;
        System.out.println(st);
        int age = 36;
        System.out.printf("Your age is %d%n", age);
        int year = 2000 - age;
        System.out.printf("age=%d ,birthdate=%d%n", age, year);
        System.out.printf("Your age is %.2f%n", (float) age);
        String formetString = String.format("Your age is %d", age);
        System.out.println(formetString);
    }
}
