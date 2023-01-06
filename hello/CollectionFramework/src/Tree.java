import java.util.TreeSet;
import java.util.*;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Object> t=new TreeSet<>();
        t.add(10);
        t.add(30);
        t.add(25);
        t.add(75);
        t.add(55);
        t.add(100);
        t.add(14);
        t.add(35);
        System.out.println(t);
        System.out.println(t.descendingSet());
        System.out.println(t.headSet(30));//all value previous of 30
        System.out.println(t.tailSet(30));//all values ofter 30 coming and 30 included
        System.out.println(t.floor(24));//
        System.out.println(t.ceiling(22));//
       /* for(Object obj:t)
        {
            System.out.println(obj);
        }
        Iterator itr=t.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/
        System.out.println(t.higher(35));
        System.out.println(t.lower(20));
        Object ele[]=t.toArray();
        for(int i=0;i<ele.length;i++)
        {
            System.out.print(ele[i]+" ");
        }
    }
}
