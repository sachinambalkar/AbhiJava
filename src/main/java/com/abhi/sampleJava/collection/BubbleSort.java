package com.abhi.sampleJava.collection;
import java.util.Arrays;
class BubbleSort {
    public static void main (String []args)
    {	int [] a= {2,5,4,6,8,3,1};
        int n=a.length;

        for(int i=0; i<n-1; i++ )
        {
            for (int j=0; j<n-i-1; j++)
            {
                if( a[j+1]<a[j])
                {
                    swap(a,j+1,j);
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
    static void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a [i]= a [j];
        a[j]= temp;
    }


}
