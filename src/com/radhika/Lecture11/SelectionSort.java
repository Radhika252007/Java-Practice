package com.radhika.Lecture11;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
