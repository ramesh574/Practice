interface inter
{
    public int squre(int x);
}

/*class test
{
    public static int squre(int x) {
        return x*x;
    }
}*/
public class SqureRoot {
    public static void main(String[] args) {
       inter i=x->x*x;
        System.out.println(i.squre(5));
    }
}
