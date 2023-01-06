package com.ramesh;
class Mythread extends Thread
{
   /* public Mythread(String name) {
        super(name);
    }*/

    @Override
    public void run() {
        int i=0;
        while(true)
        {
            System.out.println(i);
            i++;
           /* try {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }*/
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();
       // t.interrupt();
    /*    System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.isAlive());*/
    }
}
