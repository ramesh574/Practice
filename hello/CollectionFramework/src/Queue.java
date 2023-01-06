import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        /*PriorityQueue<Object> p=new PriorityQueue<Object>();
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(40);
        p.add(5);
        p.add(9);
        p.add(100);
        System.out.print(p);*/
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Your Name");
        Cricketer c=new Cricketer(sc.next());
        System.out.println(c.name);
        Cricketer c2=(Cricketer) c.clone();
        System.out.println(c2.name);
    }
}
class Cricketer implements Cloneable {
    String name;
    Object obj;
    public  Cricketer(String name)
    {
        this.name=name;
    }
   public Object clone()
    {
    try
    {
       obj= super.clone();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return obj;
    }
}
