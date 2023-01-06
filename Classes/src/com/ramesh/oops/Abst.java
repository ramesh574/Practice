package com.ramesh.oops;

public abstract class Abst {
    public void test()
    {
        System.out.println("this is test method");
    }
    public abstract void demo();
}
class test{
    public static void main(String[] args) {
        /*we cannot create object of abstract class becz abstract method
         has not any body


        Abst abs=new Abst();*/
//        MyChild m=new MyChild();
//        m.demo();
//        m.test();
        Abst abs=new MyChild();
        abs.demo();
        abs.test();

            }

        }
