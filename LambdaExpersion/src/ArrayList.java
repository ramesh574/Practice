import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

    class demo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        Collections.sort(l,(i1,i2)->i1>i2?-1:i2>i1?1:0);
            {
         /*   @Override
            public int compare(Integer o1, Integer o2) {
                return (o1>o2)?-1:(o1<o2)?1:0;
            }
        });*/
                System.out.println(l);
            }
        }
}

