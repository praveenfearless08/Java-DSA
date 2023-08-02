package com.praveen;

public class MaxIn2DArray {
    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
                
            }
        }
        return max;
    }
//for each loop
//    static int max(int[][] arr){
//        int max = Integer.MIN_VALUE;
//        for(int[] ints: arr ){
//            for(int element : ints){
//                if(element > max){
//                    max = element;
//                }
//            }
//        }
//        return max;
  //  }
    public static void main(String[] args) {
        int[][] arr = {
                {22,34,56,6},
                {39,5,4,6},
                {12,36}
        };
        System.out.println(max(arr));
    }
}
