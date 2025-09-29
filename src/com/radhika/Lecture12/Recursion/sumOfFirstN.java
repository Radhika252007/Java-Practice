package com.radhika.Lecture12.Recursion;

public class sumOfFirstN {
    public static void main(String[] args){
        System.out.println(sumofFirstNum(5));
    }
    static int sumofFirstNum(int n){
        if(n==1){
            return 1;
        }
        return n+sumofFirstNum(n-1);
    }
}
