package com.radhika.Lecture15;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Learning");
        sb.append(" Java");
        sb.insert(sb.length()," with fun");
        System.out.println(sb);
    }
}
