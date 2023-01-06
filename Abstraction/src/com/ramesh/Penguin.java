package com.ramesh;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    public void fly()
    {
        super.fly();
        System.out.println("im not very good that can i swiming instead");
    }
}
