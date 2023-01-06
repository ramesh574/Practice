import java.util.function.Function;

public class RemoveSpace {
    public static void main(String[] args) {
        String str="Ramesh kumar prajapati r t dpnur dffg ";
         // Function<String ,String> f=s -> s.replaceAll(" ","");
          Function<String,Integer> d =s->s.length()-s.replaceAll(" ","").length();
        System.out.println(d.apply(str));

    }
}
