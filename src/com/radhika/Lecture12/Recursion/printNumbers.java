package com.radhika.Lecture12.Recursion;

public class printNumbers {
    public static void main(String[] args){
        printNumbers(1,10);
    }
    static void printNumbers(int start,int end){
        if(start==end){
            System.out.println(start);
            return;
        }
        System.out.println(start);
        printNumbers(start+1,end);
    }
}
