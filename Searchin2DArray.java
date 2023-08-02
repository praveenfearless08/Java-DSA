package com.praveen;

import java.util.Arrays;

public class Searchin2DArray {
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};

                }

            }
            
        }
    return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {22,34,56,76},
                {39,5,4,6},
                {12,36}
        };
        int target = 6;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}
