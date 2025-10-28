package Practice.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20,1,34,32,4,3,56};
        sort2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //Taking middle element as Pivot
    static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int start = low, end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[mid];
        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr,low,end);
        sort(arr,start,high);
    }

    //Taking Last Element as Pivot
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    static void sort2(int[] arr, int low, int high){
        if(low<high){
            int cut = partition(arr,low,high);
            sort2(arr,low,cut-1);
            sort2(arr,cut+1,high);
        }
    }
}
