package com.chitkara.Lecture5;

public class InvertedTriangle {
    public static void main(String[] args){
        int r =5;
        for(int i=r;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
