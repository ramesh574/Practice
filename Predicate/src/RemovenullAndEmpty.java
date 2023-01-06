import java.util.ArrayList;
import java.util.function.Predicate;

class RemovenullAndEmpty {
    public static void main(String[] args) {
        String names[]={"ramesh"," ","null","kumar"," "};
        Predicate<String> ps=s -> s!="null"&& s.length()!=0;
        ArrayList<String> l=new ArrayList<>();
        for(String s:names)
        {
          if(ps.test(s))
          {
              l.add(s);
          }
        }
        System.out.println(l);
    }
}
