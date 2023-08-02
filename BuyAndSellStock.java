package com.praveen;

public class BuyAndSellStock {
    static int buyAndSellStock(int[] nums) {
        int maxProfit = 0;
        int minSoFar = nums[0];
        for (int i = 0; i < nums.length; i++) {
            minSoFar = Math.min(minSoFar,nums[i]);
            int profit = nums[i] - minSoFar;
            maxProfit = Math.max(maxProfit,profit);

        }
        return maxProfit;
    }


        public static void main (String[]args){
            int[] arr = {7, 1, 5, 3, 6, 4};
            System.out.println(buyAndSellStock(arr));

        }

    }