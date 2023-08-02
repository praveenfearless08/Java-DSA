package com.praveen;
//https://leetcode.com/problems/find-in-mountain-array/
public class searchInMountainArray {

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //Search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end){


        // find whether array is sorted to ascending order or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }

            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,2,1};
        System.out.println(search(arr,5));


    }
}
