import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String[] names={"ramesh","kumar","kishore","sumit","krishna"};
        Predicate<String> p=s -> s.charAt(0)=='k';
        System.out.println("the name start with k");
        for (String s: names)
        {
            if(p.test(s))
            {
                System.out.println(s);
            }
        }
    }
}
