public class CheckOdd {
    public static void main(String[] args) {
        System.out.println("number is odd"+isOdd(75));

    }
    public static boolean isOdd(int number)
    {
        if(number>0)
        {
            if(number%2==0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return  true;
    }
}
