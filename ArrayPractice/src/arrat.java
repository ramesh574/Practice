import java.util.Scanner;

public class arrat {

        static Scanner scanner = new Scanner(System.in);
        public static void main (String[]args){
        int[] myInteger = getInteger(5);
        printedArray(new int[]{2, 4, 6, 7, 8});
    }
        public static int[] getInteger ( int capacity)
        {
            int[] array = new int[capacity];
            System.out.println("Enter" + capacity + "Integer");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }
        public static void printedArray ( int array[])
        {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + "contents" + array[i]);
            }
        }
  /*  public static void sortInteger(int array[])
    {
        //int [] sortInteger=new int[array.length];
        int [] sortedArray= Arrays.copyOf(array,array.length);
        for(int i=0;i<sortedArray.length;i++)
        {
            System.out.println(sortedArray[i]);
        }

    }*/
    }

