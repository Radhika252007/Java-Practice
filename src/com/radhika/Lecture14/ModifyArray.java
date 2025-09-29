package com.radhika.Lecture14;

import java.util.Arrays;

public class ModifyArray {
    public static void main(String[] args) {
        String str= "Hello";
        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));
        letters[0]='C';
        System.out.println(Arrays.toString(letters));
        System.out.println(str);
    }
}
