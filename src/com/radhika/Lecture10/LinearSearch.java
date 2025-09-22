package com.radhika.Lecture10;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the Target Element: ");
        int target = in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("The index of Target Element is: "+ i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
