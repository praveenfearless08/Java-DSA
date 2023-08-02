package com.praveen;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the maximum index in array and swap with correct index
            int last = arr.length-i-1;

            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);


        }

    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i < end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }

        }
    return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =  temp;

    }

    // Revision
//    static void selectionSort2(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int last  = arr.length-i-1;
//
//            int getMax = getMaxIndex2(arr,0,last);
//            swap2(arr,getMax,last);
//
//        }
//
//    }
//    static int getMaxIndex2(int[] arr, int start ,int end){
//        int max = start;
//
//        for (int i = 0; i < end; i++) {
//            if(arr[i] > arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    static void swap2(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
//        selectionSort2(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
