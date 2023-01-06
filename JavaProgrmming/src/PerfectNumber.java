public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfecrNumber(6));
    }
    public static boolean isPerfecrNumber(int number)
    {
        int divisor=0;
        if(number<1)
        {
          return false;
        }
        else {
            for (int i = 1; i <number; i++)
            {
                if(number%i==0)
                {
                    divisor=divisor+i;
                }
            }
        }
        if(number==divisor)
        {
            return true;
        }
        return false;
    }
}
