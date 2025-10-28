package Practice.Arrays;

import java.util.Arrays;

public class mergeSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,4,9,10};
        int[] arr2 = {3,4,5,6,7};
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=0, j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i];
                i++;
            }
            else if(arr1[i]> arr2[j]){
                arr3[k++] = arr2[j];
                j++;
            }
            else{
                arr3[k++] = arr1[i];
                arr3[k++] = arr2[j];
                i++;
                j++;
            }
        }
        if(i<arr1.length){
            while(i< arr1.length){
            arr3[k++] = arr1[i];
            i++;
            }
        }
        if(j<arr2.length){
            while(j< arr2.length){
                arr3[k++] = arr2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
