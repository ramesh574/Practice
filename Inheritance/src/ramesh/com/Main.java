package ramesh.com;

public class Main  {
    public static void main (String[] args) {
        Animal animal=new Animal("animal",1,1,5,5);
        Dog dog=new Dog("jakee",8,20,2,4,1,20,"sheru");
        dog.eat();
        //animal.move("12KM speed");;
        dog.walk();
        dog.run();
        System.out.println(dog);
    }
}