package com.radhika.Lecture15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=  in.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("The Number of tokens in the line are: "+ st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }

}
