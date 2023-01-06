import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
  HashSet<Object> h=new HashSet<Object>();
  /*h.add(10);
        System.out.println("Hash Code"+h.hashCode());
  h.add(20);
        System.out.println("Hash Code"+h.hashCode());
  h.add(50);
        System.out.println("Hash Code"+h.hashCode());
  h.add(35);
        System.out.println("Hash Code"+h.hashCode());
        h.add(55);
        System.out.println("Hash Code"+h.hashCode());
        System.out.println(h);*/
        h.add("java");
        System.out.println(h.hashCode());
        h.add("python");
        System.out.println(h.hashCode());
    }
}
