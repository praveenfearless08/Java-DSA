package com.praveen;

public class maxValue {
    //Maximum Value
    static int maxValue(int arr[]){
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }

        return maxVal;
    }
    //Maximum Value in Range
    static int maxInRange(int arr[],int start, int end){
        int maxValue = arr[start];
        for(int i = 0; i < end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;


    }

    public static void main(String[] args) {
        int[] arr = {5,7,9,27,10,8};
        System.out.println(maxValue(arr));
        System.out.println(maxInRange(arr,0,3));
    }
}
