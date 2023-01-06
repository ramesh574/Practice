public class FirstnLastSum {
    public static void main(String[] args) {
        System.out.println("sum of first and last digit is "+sumFirstAndLastDigit(5));

    }
    public static int  sumFirstAndLastDigit(int number)
    {

        int first=0;
        int last=0;
         last=number%10;
        while(number>0)
        {
            first=number%10;
            number=number/10;
        }
        int sum=first+last;
        if(number<0)
        {
            return -1;
        }
        else
        {
            return  sum;
        }
    }
}
