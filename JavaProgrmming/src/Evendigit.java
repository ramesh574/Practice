public class Evendigit {
    public static void main(String[] args) {
        System.out.println("even digit sum is "+getEvenDigitSum(-10));
    }

        public static int getEvenDigitSum(int number) {
        if(number<0)
        {
            return -1;
        }
            int sum, lastDigit;
            for(sum=0; number!=0; number/=10){
                lastDigit = number%10;
                if(lastDigit % 2 == 0)
                    sum += lastDigit;
            }
            return sum;
        }

}


