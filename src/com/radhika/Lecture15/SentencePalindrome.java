package com.radhika.Lecture15;

public class SentencePalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        String result = str.replaceAll("[^a-zA-Z]","");
        StringBuilder sb = new StringBuilder(result);
        sb.reverse();
        String reversedStr = sb.toString();
        if(reversedStr.equalsIgnoreCase(result)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


    }
}
