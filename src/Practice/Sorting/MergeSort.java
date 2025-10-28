package Practice.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,34,2,5,6,7,8,643,320};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void merge(int[] arr, int l, int m , int h){
        int n1 = m-l+1, n2 = h-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr,l,L,0,n1);
        System.arraycopy(arr,m+1,R,0,n2);
        int i=0,j=0,k=l;
        while (i<n1 && j<n2){
            if(L[i]<=R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
    }
    static void sort(int[] arr, int l, int r){
        if(l<r){
            int m = l + (r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}
