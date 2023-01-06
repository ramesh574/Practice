public class MergeSort {
    public static void main(String[] args) {
        int a[]={2,1,43,32,48,12,54,3,9};
        int lb=0;
        int ub= a.length;
        mergesort(a,lb,ub);
    }
        public static void mergesort(int[] a, int lb, int ub) {
            if (lb < ub) {
                int mid = (lb + ub) / 2;
                {
                    mergesort(a, lb, mid);
                    mergesort(a, mid + 1, ub);
                    MergeS(a, lb, mid, ub);
                }
            }
        }
        public static void MergeS(int a[],int lb,int mid,int ub)
        {
            int i=lb;
            int j=mid+1;
            int k=lb;
            int b[]=new int[lb-ub];
            while(i<=mid&&j<=ub)
            {
                if(a[i]<=a[j]) {
                    b[k] = a[i];
                    i++;
                }
                else {
                    b[k]=a[j];
                    j++;
                }
                k++;
            }
            if(i>mid)
            {
                while(j<=ub)
                {
                    b[k]=a[j];
                    j++;
                    k++;
                }
            }
            else {
                while(i<=mid)
                {
                    b[k]=a[i];
                    i++;k++;

                }
            }
            for(k=lb;k<=ub;k++)
            {
                a[k]=b[k];
            }
            System.out.print("Merge Sorted array  ");
            for(int m:a)
            {
                System.out.print(m);
            }
    }

}
