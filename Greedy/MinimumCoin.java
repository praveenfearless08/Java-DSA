package com.praveen.Greedy;
import java.util.*;


// To find minimum no. of coin for given amount of money

public class MinimumCoin {
    static int minCoin(int coin[], int amount, int n){
        Arrays.sort(coin);
        int res = 0;
        for (int i = n-1; i >= 0; i--) {
            if(amount >= coin[i]){
                int c = (int)Math.floor(amount/coin[i]);
                 res = res + c;
                amount = amount - c * coin[i];
            }
            if(amount == 0){
                break;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int coin[] = {1,10,5,2};
        int amount = 98;
          int ans = minCoin(coin,amount,4);
        System.out.println(ans);
    }
}
