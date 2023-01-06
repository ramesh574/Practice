public class MinutesToYearDay {
    public static void main(String[] args) {
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
         int y= (int) (minutes/(60*24*365));
         int d=(int) (minutes/ 60 / 24) % 365;
            System.out.println(minutes+" min= "+y+" y "+"and "+d+" d ");
        }
    }
}
