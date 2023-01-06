public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
    }
    public static void printFactors(int number)
    {
        int divisor=0;
        if(number<1)
        {
            System.out.println("Invalid Value");
        }
        else {
            for (int i = 1; i <number; i++)
            {
              if(number%i==0)
              {
                  divisor=divisor+i;
                  System.out.print(divisor);
              }
            }
        }
    }
}
