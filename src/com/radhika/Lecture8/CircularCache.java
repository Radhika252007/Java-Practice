package com.radhika.Lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class CircularCache {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of cache: ");
        int cacheSize = in.nextInt();
        String[] cache = new String[cacheSize];
        in.nextLine();
        int count = 0;
        System.out.print("Enter the number of Elements you want to add: ");
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){
            String val = in.nextLine();
            cache[count] = val;
            count = (count+1)%cacheSize;
        }
        System.out.println(Arrays.toString(cache));

    }

}
