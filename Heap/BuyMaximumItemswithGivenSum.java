package com.praveen.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BuyMaximumItemswithGivenSum {
    public static void main(String[] args) {
        int n = 5;
        int cost[] = new int[]{1, 12, 15, 111, 200};
        int sum = 111;


        //Sort Method
//        int res = 0;
//        Arrays.sort(cost);
//        for (int i = 0; i < n; i++) {
//            if(cost[i] <= sum){
//                sum -= cost[i];
//                res++;
//            }else{
//                break;
//            }
//
//        }
//        System.out.println(res);


        //Head Method
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int res = 0;

        for (int i = 0; i < n; i++) {
            pq.add(cost[i]);
        }

        for(int i = 0; i < n; i++){
            if(pq.peek() <= sum){
                sum -= pq.poll();
                res++;
            }else{
                break;
            }
        }
        System.out.println(res);

    }
}
