package com.chitkara.Lecture6;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
