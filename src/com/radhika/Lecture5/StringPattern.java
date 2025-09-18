package com.radhika.Lecture5;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        for(int i=0;i<name.length();i++){
            for(int j=i;j<name.length();j++){
                char ch = name.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
