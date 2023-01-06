import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=0;
        int max=0;
        while(true)
        {
            System.out.println("Enter a number");
            boolean isAnINt=sc.hasNextInt();
            if(isAnINt)
            {
                int number= sc.nextInt();
                if(number>max)
                {
                    max=number;
                }
                if(number<min)

                {
                    min=number;
                }
            }
            else {
                break;

            }
        }
        System.out.println("min="+min+"max"+max);
        sc.close();
    }
}
