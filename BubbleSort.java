package com.praveen;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at last index respectively
            for (int j = 1; j < arr.length-i; j++) {
                //Swap if item is smaller than the previous one
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]  =arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            //if no elements is swapping it means array has already sorted so loop will break
        if(!swapped){
            break;
        }
        }

    }
    static void bubbleSort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-23,-1,3,-12};
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));

    }
}
