package com.ramesh.oops;

public interface Shape {
    int i=34;
    public abstract void calculatorArea(int r);


}
class Circle implements Shape{


    @Override
    public void calculatorArea(int r) {

        System.out.println("Area of circle is"+(Math.PI*r*r));
    }

    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculatorArea(2);

    }
}
