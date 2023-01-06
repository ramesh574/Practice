public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(55,15));
    }
    public static boolean hasSharedDigit(int a,int b) {
        int lastdigitofa = a % 10;
        int firstdigitofa = a / 10;
        int lastdigitofb = b % 10;
        int firstdigitofb = b / 10;
         if((a > 99) || (a < 10) || (b > 99) || (b < 10))
         {
             return false;
        } else if ((lastdigitofa == lastdigitofb) || (firstdigitofa == firstdigitofb)) {
            return true;
        } else if ((firstdigitofa == lastdigitofb) || (lastdigitofa == firstdigitofb)) {
            return true;

        } else {
             return false;
        }
    }
}
