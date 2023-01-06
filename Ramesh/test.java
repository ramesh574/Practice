 class test{
    public static void main(String[] args) {
  calcFeetAndInchesToCentimeters(6,0);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) || ((inches >= 0) && (inches <= 12))) {
            return -1;
        }
        double centimeter=(feet*12)*2.54;
        centimeter+=inches*2.54;
        System.out.println(feet+"feet"+inches+"inches"+centimeter+"cm");
        return centimeter;


    }
}