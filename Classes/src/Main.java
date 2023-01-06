public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //car.name="TATA";
        //System.out.println("CarName -"+car.getName());
        //System.out.println("CarPrice -"+car.getPrice());
        car.setModel("TMax5 ");
        car.setName("Maruti Car ");
        car.setPrice(100000);
        car.describeCar();
        System.out.println(car.getName());
    }
}