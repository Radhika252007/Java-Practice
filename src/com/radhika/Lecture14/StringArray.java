package com.radhika.Lecture14;

public class StringArray {
    public static void main(String[] args) {
        String str = new String("Hello");
        char[] letters = str.toCharArray();
        for(int i=0;i< letters.length;i++){
            System.out.print(letters[i]+" ");
        }
    }
}
