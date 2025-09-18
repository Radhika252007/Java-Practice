package com.radhika.Lecture6;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int pos = 2;
        int n = 6;
        for(int i= arr.length-1;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = 32;
        n++;
        System.out.println(Arrays.toString(arr));
    }
}
