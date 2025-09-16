package com.chitkara.Lecture7;

public class PrintElements {
    public static void main(String[] args){
        int[][] matrix = {
                {1,32,3,4,5},
                {2,3,76,3,2},
                {3,32,56,22,2}
        };
        for(int[] row: matrix){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
