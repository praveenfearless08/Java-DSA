package com.praveen;

public class SortedMatrixSearch {
    public static void search(int[][] matrix, int n, int x){
        int i = 0;
        int j = n-1;

        while(i < n && j >= 0){
            if(matrix[i][j] == x){
                System.out.println(" x found at "+i+" , " + j );
                return;
            }
            if(matrix[i][j] > x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30},
                {15,25,35},
                {27,29,37},

        };
        search(matrix,3,37);
    }
}
