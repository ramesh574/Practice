public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(isValid(10));
    }
    public static boolean hasSameLastDigit(int a,int b,int c)
    {
        int lastdigitofa=a%10;
        int lastdigitofb=b%10;
        int lastdigitofc=c%10;
        if((a > 1000) || (a < 10) || (b > 1000) || (b < 10)||(c>1000)||(c<10))
        {
            return false;
        }
        else if(lastdigitofa==lastdigitofb)
        {
            return  true;
        }
        else if(lastdigitofb==lastdigitofc)
        {
            return true;
        } else if (lastdigitofc==lastdigitofa) {
            return true;
        }
        else
        {
            return  false;
        }
    }
    public  static boolean isValid(int d)
    {
        if((d<=1000)&&(d>=10))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
