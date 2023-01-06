package com.company;

public class MergeSort {
    int []arr;
    int[] tempMergearr;
    int length;
    public static void main(String[] args) {
        int a[]={48,36,13,53,94,21};
                MergeSort ms=new MergeSort();
        ms.sort(a);
        for(int i:a) {
            System.out.println(i);
        }
    }
    public  void sort(int[] a){
        this.arr=a;
        this.length=a.length;
        this.tempMergearr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerIndex,int higherIndex)
    {
        if(lowerIndex<higherIndex)
        {
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;
            divideArray(lowerIndex,middle);
            divideArray(middle+1,higherIndex);
            mergeArray(lowerIndex,middle,higherIndex);

        }

    }

    public void mergeArray(int lowerIndex,int middle,int higherIndex)
    {
        for(int i=lowerIndex;i<higherIndex;i++)
        {
            tempMergearr[i]=arr[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while(i<=middle&&j<=higherIndex)
        {
            if (tempMergearr[i] <= tempMergearr[j])
            {
                arr[k]=tempMergearr[i];
                i++;
            }
            else
            {
                arr[k]=tempMergearr[j];
                j++;
            }
            k++;
        }
        while(i<=middle)
        {
            arr[k]=tempMergearr[i];
            k++;
            i++;
        }
    }
}
