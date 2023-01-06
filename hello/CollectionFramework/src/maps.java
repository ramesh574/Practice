import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class maps {
    public static void main(String[] args) {
        Map<Integer,String> m=new TreeMap<Integer,String>();
        m.put(1,"ramesh");
        m.put(2,"ankit");
        m.put(3,"sohan");
        m.put(1,"rames");
        m.put(4,null);
        System.out.println(m);
        System.out.println(m.get(1));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey(2));
        m.remove(1);
        System.out.println(m);
        m.replace(2,"sonu");
        System.out.println(m);
        for(Map.Entry e: m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        Iterator i=m.entrySet().iterator();
        while(i.hasNext())
        {
           Map.Entry e=(Map.Entry) i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
