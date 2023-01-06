public class PalindromeCheck {
    public static void main(String[] args) {
    // isPalindrome(121) ;
        System.out.println("it is palindrome number "+ isPalindrome(-222) );
    }
    public static boolean isPalindrome(int number)
    {
        int z=number;
        int r, reverse=0;
        while(number!=0)
        {
            r=number%10;
            reverse=reverse*10+r;
            number=number/10;
        }
        if(z==reverse)
        {
            return true;
        }
        else
            return false;
    }
}
