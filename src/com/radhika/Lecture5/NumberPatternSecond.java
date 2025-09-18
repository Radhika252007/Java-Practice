package com.radhika.Lecture5;

public class NumberPatternSecond {
    public static void main(String[] args){
        int r = 7;
        for(int i=r;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=r;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
