package com.ramesh;
class Mydata
{
    public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
class MineThread1 extends Thread
{
    Mydata d;
    public MineThread1(Mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("hello ramesh");
    }
}
class MineThread2 extends Thread {
    Mydata d;

    public MineThread2(Mydata d) {
        this.d = d;
    }

    public void run() {
        d.display("hello ankit");
    }
}

public class Synchronization {
    public static void main(String[] args) {
      Mydata data=new Mydata();
      MineThread1 t1=new MineThread1(data);
      MineThread2 t2=new MineThread2(data);
      t1.start();
      t2.start();
    }
}
