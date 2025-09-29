package com.radhika.Lecture14;

public class ReplaceVowels {
    public static void main(String[] args) {
        String str = "Hello There";
        char[] letters = str.toCharArray();
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    letters[i] = '*';
                    break;
            }
        }
        String newStr = new String(letters);
        System.out.println(letters);
    }
}
