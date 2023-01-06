public class ShellSort {
    public static void main(String[] args) {
        int a[]={2,1,65,-32,43,87,5};
        for(int gap=(a.length)/2;gap>=1;gap/=2 )
        {
           for(int j=gap;j<a.length;j++)
           {
               for(int i=j-gap;i>=0;i-=gap)
               {
                   int temp;
                   if(a[i+gap]>a[i])
                   {
                       break;
                   }
                   else {
                       temp=a[i+gap];
                       a[i+gap]=a[i];
                       a[i]=temp;
                   }
               }
           }
        }
        System.out.println("Sorted Array");
        for(int m:a)
        {
            System.out.print(m+" ");
        }
    }
}
