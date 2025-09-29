package com.radhika.Lecture14;

public class StringModification {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder("HelloThere");
        int j = sb.length();
        char[] letters = {'a','b','c'};
        long starttime1 = System.nanoTime();
        for(int i=0;i< letters.length;i++){
            str += letters[i];
        }
        long endtime1 = System.nanoTime();
        System.out.println("Time taken by string +: " + (endtime1-starttime1));
        long starttime2 = System.nanoTime();
        for(int i=0;i< letters.length;i++){
            sb.append(letters[i]);
        }
        long endtime2 = System.nanoTime();
        System.out.println("Time taken by String Builder:" +(endtime2-starttime2));
    }
}
