package com.ramesh.inheritance;

public class Student {
    private int id;
    private String name;
    private String city;
    private double price;

    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(int id, String name, String city, double price) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.city = city;
        System.out.println("name" + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
