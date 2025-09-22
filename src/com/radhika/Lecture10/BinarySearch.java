package com.radhika.Lecture10;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in ascending order");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the Target Element: ");
        int target = in.nextInt();
        int result = targetElement(arr,target);
        if(result==-1){
            System.out.println("No Element found");
        }
        else{
            System.out.println("The Index of Target Element is: "+ result);
        }
    }
    static int targetElement(int[] arr,int target){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
