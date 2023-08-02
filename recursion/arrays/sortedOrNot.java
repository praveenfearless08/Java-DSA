package com.praveen.recursion.arrays;

public class sortedOrNot {
    static boolean sorted(int[] arr, int index) {
        //Base condition
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8};
        System.out.println(sorted(arr,0));

    }
}
