import java.util.function.Supplier;

public class RandomName {
    public static void main(String[] args) {
        Supplier<String > s=()-> {
            String s1[] = {"ramesh", "ankit", "sonu","ranu"};
            int x=(int) (Math.random()*4);
            return s1[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
