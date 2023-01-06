import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
         inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        int sum=0;
        long count=0;
        long avg=0;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number");
            boolean isAnINt = sc.hasNextInt();
            if(isAnINt) {
                int number = sc.nextInt();
                 sum=sum+number;
                 count++;
                // avg=sum/count;
            }

            else {
                break;
            }
        }
        avg=(int) Math.round((double) sum/count);
        System.out.println("SUM = "+sum+" AVG + "+avg);
    }
}
