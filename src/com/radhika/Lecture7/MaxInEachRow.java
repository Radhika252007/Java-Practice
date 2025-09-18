package com.radhika.Lecture7;

public class MaxInEachRow {
    public static void main(String[] args){
        int[][] matrix = {
                {1,32,3,4,5},
                {2,3,76,3,2},
                {3,32,56,22,2}
        };
        for(int[] row : matrix){

            int max = row[0];
            for(int i=1;i<row.length;i++){
                if(row[i]>max){
                    max = row[i];
                }
            }
            System.out.println("Max Element in Row: " + max);
        }
    }
}
