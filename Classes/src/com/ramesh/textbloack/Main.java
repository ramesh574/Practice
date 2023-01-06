package com.ramesh.textbloack;

public class Main {
    public static void main(String[] args) {
        format("Ramesh");
    }

    public static void format(String str) {
        int length = str.length();
        System.out.printf("Length=%d%n ", length);
        System.out.printf("First char =%c%n", str.charAt(0));
        System.out.printf("First char =%c%n", str.charAt(length - 1));

    }
}
