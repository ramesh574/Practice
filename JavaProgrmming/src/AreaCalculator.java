public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0,4.0));

    }
    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1.0;
        }
        else {
            //double pi = 3.14;
            double m=radius*radius*Math.PI;
            return m;
        }

    }
    public static double area(double x,double y)
    {
        if(x<0||y<0)
        {
            return -1.0;
        }
        else
        {
            double z =x*y;
            return z;

        }
    }
}
