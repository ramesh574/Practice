import java.util.*;
import java.util.Iterator;
public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque <Object> a=new ArrayDeque<Object>();
        a.add(10);
        a.add(20);
        a.addFirst("java");
        a.addLast("C#");
        a.add(40);
        a.add(50);
        //System.out.println(a);
      /*  for(Object obj: a)
        {
            System.out.print(obj);
        }*/
       /* Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }*/
       while(!a.isEmpty())
       {
           a.remove();
           System.out.println(a);
           //Thread.sleep(100);
       }
    }
}
