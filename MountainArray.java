package com.praveen;

public class MountainArray {
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in deacreasing part of array
                //if mid is not the answer then  search in left side of array
                //this is why end is not equal to mid-1
                end = mid ;
            }else{
                //you are in ascending part of array
                start = mid + 1; //Because we know that mid+1 element > mid element
            }
        }
        //In the end start == end and pointing to largest number in array
        return start;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,5,3,2,1};

    }
}
