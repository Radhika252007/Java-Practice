package com.radhika.Lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        int product = 1;
        for(int i=0;i< matrix.length;i++){
            product*= matrix[i][i];
        }
        for(int i=0;i< matrix.length;i++){
            matrix[i][i] = product;
        }
        for(int i=0;i< matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
