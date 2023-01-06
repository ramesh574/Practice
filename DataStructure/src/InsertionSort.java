public class InsertionSort {
    public static void main(String[] args) {
        int a[]={2,1,65,-32,43,87,5};
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while(j>=0&&a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println("Sorted Array ");
        for(int m:a)
        {
            System.out.print(m+" ");
        }
    }
}
