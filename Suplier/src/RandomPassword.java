import java.util.function.Supplier;

public class RandomPassword {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            Supplier<Integer> d = () -> (int) (Math.random() * 10);
            String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> c = () -> symbol.charAt((int) (Math.random() * 29));
            String pass = "";
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    pass = pass + d.get();
                } else {
                    pass = pass + c.get();
                }
            }
            return pass;

        };
        System.out.println(s.get());
    }
}
