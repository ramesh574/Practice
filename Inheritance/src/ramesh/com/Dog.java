package ramesh.com;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private  String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.coat=coat;
        this.teeth=teeth;
        this.legs=legs;
        this.tail=tail;
    }
    private void chew()
    {
        System.out.println("Dog.chew() called");
    }
    public void eat() {
        System.out.println("Dog .eat() called");
        chew();
        super.eat();
    }
    @Override
    public String toString() {
        return "Dog [eyes=" + eyes + ", legs=" + legs + ", tail=" + tail + ", teeth=" + teeth + ", coat=" + coat + "]";
    }
    public void walk()
    {
        System.out.println("Dog.walk() called");
       super.move(5);
    }
    public void run()
    {
        System.out.println("Dog.run() called");
        move(12);
    }
}
