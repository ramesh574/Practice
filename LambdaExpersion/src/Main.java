public interface Main {
    public int display(int x, int y);

}
 class lambda {
    public static void main(String[] args) {
        Main m = (a, b) -> {
            return a + b;
        };
        System.out.println(m.display(10, 20));

    }
}