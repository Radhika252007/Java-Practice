package com.radhika.Lecture7;

public class SumOfEachColumn {
    public static void main(String[] args){
        int[][] matrix = {
                {1,32,3,4,5},
                {2,3,76,3,2},
                {3,32,56,22,2}
        };
        for(int i=0;i<matrix[0].length;i++){
            int sum  =0 ;
            for(int j=0;j<matrix.length;j++){
                sum += matrix[j][i];
            }
            System.out.println("Sum of Column "+ i +" is: "+ sum);
        }
    }
}
