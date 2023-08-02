package com.praveen.recursion.sorting;

import java.util.Arrays;

public class mergeSort {
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible thay array is not complete
        //copy the remaining elements
        while( i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while( j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3,5};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
