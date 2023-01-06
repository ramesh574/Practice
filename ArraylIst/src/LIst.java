import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public  class LIst {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
                ls.add(4);
                ls.add(3);
                ls.add(1);
                ls.add(6);
                ls.add(8);
              /*  Iterator itr= ls.iterator();
                while(itr.hasNext())
                {
                    System.out.print(itr.toString()+" ");
                }
               ls.add(0,2);
               ls.remove(3);
              System.out.println(ls.contains(3));*/
            Object m[]= ls.toArray();
               for (Object i:m) {
            System.out.println(i);
             }

            }
        }

