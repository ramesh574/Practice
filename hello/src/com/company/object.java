package com.company;

class object
{
    public static void main(String[] args)
    {
        Dog d1;
       d1= new Dog();
       d1.name="ramesh";
       d1.color="blue";
       d1.cost=2999;
        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println(d1.cost);
        System.out.println(d1);
    }
}
class Dog
{
    String name;
    String color;
    int cost;
}