package com.praveen;
//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

// TO find the largest contiguous sub array we use kadane algorithm
// we compare lastMax with resultant max
public class largestContigousSubArray {
    public static int subArray(int[] arr, int n){

        int res = arr[0];
        int lastMax = arr[0];

        for (int i = 1; i < n; i++) {
            lastMax = Math.max(lastMax + arr[i], arr[i]);
            res = Math.max(res,lastMax);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,1,-1,-2,2,7,12,3,-9,4};
        int n = arr.length;
        System.out.println(subArray(arr,n));

    }
}
