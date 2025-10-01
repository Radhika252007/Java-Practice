package com.radhika.Lecture15;

import java.util.Scanner;

public class StringBuliderMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

    }
}
