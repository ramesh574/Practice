import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("red");
        al.add("green");
        al.add("orange");
        al.add("yellow");
        al.add(0,"blue");
        for(String a:al)

        System.out.println(a);
        String s= al.get(0);
        System.out.println("first element is "+s);
        String s1= al.set(2,"black");
        System.out.println(al);
    }
}
