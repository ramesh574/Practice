import java.util.TreeSet;

class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> al = new TreeSet<>((i1,i2)->i1>i2?-1:i1<i2?1:0);
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(40);
        System.out.println(al);
    }
}
