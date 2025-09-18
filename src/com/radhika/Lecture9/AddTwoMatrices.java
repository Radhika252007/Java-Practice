package com.radhika.Lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of matrix1: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix1 = new int[n][m];
        for(int i=0;i< matrix1.length;i++){
            for(int j=0;j< matrix1[0].length;j++){
                matrix1[i][j] = in.nextInt();
            }
        }
        int[][] matrix2 = new int[n][m];
        for(int i=0;i< matrix2.length;i++){
            for(int j=0;j< matrix2[0].length;j++){
                matrix2[i][j] = in.nextInt();
            }
        }
        int[][] result = new int[n][m];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }

    }
}
