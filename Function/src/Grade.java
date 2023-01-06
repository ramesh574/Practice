import java.util.ArrayList;
import java.util.*;

//import static sun.security.ssl.SSLContextImpl.CustomizedSSLProtocols.populate;

class Student{
    String name;
    int marks;
    public Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}
public class Grade {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        populate(l);
    }

    private static void populate(ArrayList<Student> l) {
        l.add(new Student("ramesh",99));
        l.add(new Student("sonu",59));
        l.add(new Student("soni",69));
        l.add(new Student("ankit",19));
        l.add(new Student("ram",90));


    }
}
