package com.praveen;

//https://leetcode.com/problems/find-the-duplicate-number/
//Amazon

public class FindDuplicates {
    static int duplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }
            else{
                i++;
            }

        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =  temp;

        }
    public static void main(String[] args) {
        int[] arr = {5,1,1,54,3,2,1};
        System.out.println(duplicate(arr));

    }
}
