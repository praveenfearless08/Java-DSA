package com.praveen;

public class maxWealth {

    public int maximumWealth(int[][] accounts){
        int result = Integer.MIN_VALUE;

        for (int[] ints:accounts) {
            int sum = 0;
            for(int anints:ints){
                sum += anints;

            }
            if(sum > result){
                result = sum;
            }
        }
        return result;
    }




//        for(int person = 0; person<accounts.length; person++){
//            int sum = 0;
//            for(int account = 0; account < accounts[person].length; account++){
//                sum += accounts[account][person];
//
//            }
//            if(sum > result){
//                result = sum;
//            }
//        }
//        return result;
//    }
    public static void main(String[] args) {


    }
}
