package com.radhika.Lecture9;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n for its fibonacci: ");
        int n = in.nextInt();
        System.out.println(n + "th fibonacci number is: "+ fib(n));
    }
    static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1)+ fib(n-2);
    }
}
