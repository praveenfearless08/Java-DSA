package com.praveen;

public class minValue {
    static int minValue(int[] arr){
        int minValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }

        }
    return minValue;
    }
    public static void main(String[] args) {
        int[] arr = {12,9,23,6,7};
        System.out.println(minValue(arr));

    }
}
