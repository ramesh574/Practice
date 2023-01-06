public class SelectionSort {
    public static void main(String[] args) {
        int array[]={-4,35,21,55,-22,2,1};
        for(int lastindex= array.length-1;lastindex>0;lastindex--)
    {
      int largest=0;
        for(int i=1;i<lastindex;i++)
        {
            if (array[i] > array[largest])
            {
               largest=i;
            }
            swap(array,largest,lastindex);
        }
    }
        System.out.print("sorted array  ");
        for(int i=0;i< array.length;i++)
    {
        System.out.print(array[i]+" ");
    }

}
    public static void swap(int a[],int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
