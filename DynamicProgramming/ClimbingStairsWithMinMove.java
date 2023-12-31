package com.praveen.DynamicProgramming;

public class ClimbingStairsWithMinMove {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[]{1, 2, 3, 4, 2, 2, 0, 1, 1, 1};


        Integer[] dp = new Integer[n+1];
        dp[n] = 0;

        for (int i = n-1; i >= 0; i--) {
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i+j < dp.length; j++) {
                    if(dp[i+j] != null){
                       min = Math.min(min,dp[i+j]);
                    }
                }
                if(min != Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }

            }
        }
        System.out.println(dp[0]);
    }


}
