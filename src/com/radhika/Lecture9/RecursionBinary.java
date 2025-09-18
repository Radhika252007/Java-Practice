package com.radhika.Lecture9;

import java.util.Scanner;

public class RecursionBinary {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target Element: ");
        int target = in.nextInt();
        int start = 0, end = arr.length-1;
        if(binarySearch(arr,start,end,target)== -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("The Index of Target Element is: " + binarySearch(arr,start,end,target));
        }

    }
    static int binarySearch(int[] arr,int start, int end,int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,start,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,end,target);
        }
    }
}
