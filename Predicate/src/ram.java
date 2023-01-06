 import java.util.function.Predicate;

    class ram {
        public static void main(String[] args) {
            Predicate<Integer> p= i->i>10;
            System.out.println(p.test(100));
        }
    }
