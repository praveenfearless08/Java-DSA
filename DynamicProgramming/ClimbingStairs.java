package com.praveen.DynamicProgramming;

public class ClimbingStairs {

    //Memoization Method
    public static int countPath(int n, int[] dp){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        if(dp[n] > 0){
            return dp[n];
        }
        int nm1 = countPath(n-1,dp);
        int nm2 = countPath(n-2,dp);
        int nm3 = countPath(n-3,dp);
        int cp = nm1 + nm2 + nm3;

        dp[n] = cp;
        return cp;

    }

    //Tabulation Method

    public static int countPath2(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i == 1){
                 dp[i] = dp[i-1];
            }else if(i == 2){
                 dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }

        }
        return dp[n];
    }
    public static void main(String[] args) {
       int n = 10;
       int cp = countPath(n,new int[n+1]);
        System.out.println(cp);
       int cp2 = countPath2(n);
        System.out.println(cp2);
    }
}
