package com.radhika.Lecture15;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String lowered = str.toLowerCase();
        StringBuilder sb = new StringBuilder(lowered);
        sb.reverse();
        System.out.println(sb);
    }
}
