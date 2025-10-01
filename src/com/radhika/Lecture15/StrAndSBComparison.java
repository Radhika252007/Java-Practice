package com.radhika.Lecture15;

public class StrAndSBComparison {
    public static void main(String[] args) {
        String str = "";
        int i=1;
        long startTime1 = System.nanoTime() ;
        while(i<=1000){
            str += i;
            i++;
        }
        long endTime1 = System.nanoTime();
        System.out.print("Time taken to Concatenate a String is: ");
        System.out.println(endTime1 - startTime1);
        StringBuffer sb = new StringBuffer();
        i = 1;
        long startTime2 = System.nanoTime();
        while(i<=1000){
            sb.append(i);
            i++;
        }
        long endTime2 = System.nanoTime();
        System.out.print("Time taken to Concatenate a StringBuffer is: ");
        System.out.println(endTime2 - startTime2);

    }}
