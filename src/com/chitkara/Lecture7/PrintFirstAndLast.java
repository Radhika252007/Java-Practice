package com.chitkara.Lecture7;

public class PrintFirstAndLast {
    public static void main(String[] args){
        int[][] matrix = {
                {1,32,3,4,5},
                {2,3,76,3,2},
                {3,32,56,22,2}
        };
        for(int i=0;i<matrix.length;i++){
            if(i==0 || i== matrix.length-1){
                for(int j = 0;j< matrix[i].length;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
