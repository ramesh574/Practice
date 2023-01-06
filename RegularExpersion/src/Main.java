public class Main {
    public static void main(String[] args) {
        String s="i am ramesh ,i am 23";
        System.out.println(s);
        String yours=s.replaceAll("i","he");
        System.out.println(yours);
        String alphanumeric="abcde12sdfjkad56fadfa";
        System.out.println(alphanumeric.replaceAll("^abcde","y"));
        String seconds="abcde12sdfjkad56fadfa";
        System.out.println(seconds.replaceAll("^abcde","yyy"));
    }
}