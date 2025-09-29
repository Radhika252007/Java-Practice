package com.radhika.Lecture12.Recursion;

public class NQueens {
    public static void main(String[] args){
        char[][] board = new char[4][4];
        for(int i=0;i< board.length;i++){
            for(int j=0;j< board.length;j++){
                board[i][j] = '.';
            }
        }
        placeQueens(board,0);

    }
    static void placeQueens(char[][] board,int row){
            if(row==board.length){
                display(board);
                System.out.println();
            }

            for(int i=0;i< board.length;i++){
                    if(isSafe(board,row,i)){
                        board[row][i] = 'Q';
                        placeQueens(board,row+1);
                        board[row][i] = '.';
                    }
            }
    }
    static boolean isSafe(char[][] board, int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int minLeft= Math.min(row,col);
        for(int i=minLeft;i>=0;i--){
            if(board[row-i][col-i]=='Q'){
                return false;
            }
        }
        int minRight = Math.min(row,board.length-col-1);
        for(int i=1;i<=minRight;i++){
            if(board[row-i][col + i]=='Q'){
                return false;
            }
        }
        return true;
    }
    static void display(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
