package com.ramesh;

public class Main {
    public static void main(String[] args) {
      Dog dog=new Dog("yorkii");
      dog.breathe();
      dog.eat();
      Parrot parrot=new Parrot("indian peacock");
      parrot.eat();
      parrot.breathe();
      parrot.fly();
      Penguin p=new Penguin("simmi");
      p.fly();
    }
}