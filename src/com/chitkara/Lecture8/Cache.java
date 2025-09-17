package com.chitkara.Lecture8;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class Cache {
    public static void main(String[] args){
        System.out.print("Enter the Cache Size:");
        Scanner in = new Scanner(System.in);
        int cacheSize = in.nextInt();
        String[] cache = new String[cacheSize];
        in.nextLine();
        int count = 0;
        System.out.print("Enter the number of inputs you want to add: ");
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){
            String val = in.nextLine();
            if(count<cacheSize){
                for(int j=count;j>0;j--){
                    cache[j] = cache[j-1];
                }
                cache[count] = val;
                count++;
            }
            else{
                for(int j=cacheSize-1;j>0;j--){
                    cache[j] = cache[j-1];
                }
                cache[0] = val;
            }
        }
        System.out.println(Arrays.toString(cache));
    }
}
