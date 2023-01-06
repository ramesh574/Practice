 import java.util.*;
public class LInkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(1,50);
        ll.addFirst(5);
        ll.addLast(60);
        ll.add(null);
        System.out.println(ll);
        System.out.println(ll.contains(20));
       // ll.clone();
        System.out.println(ll.getFirst());
        ll.offer(20);
        System.out.println(ll);
        System.out.println("peek"+ll.peek());
        System.out.println(ll);
        System.out.println("poll"+ll.poll());
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);

    }
}

