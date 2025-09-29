package com.radhika.Lecture12.Recursion;

public class StringPalindrome {
    public static void main(String[] args){
        String s = "abcbb";
        String reversed = palindrome("",s, s.length()-1);
        if(s.equals(reversed)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    static String palindrome(String up,String p,int i){
        if(i<0){
            return up;
        }
        up = up + p.charAt(i);
        return palindrome(up,p,i-1);
    };
}
