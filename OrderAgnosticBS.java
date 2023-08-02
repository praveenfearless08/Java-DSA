package com.praveen;


public class OrderAgnosticBS {
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
//        int[] arr = {-6,-4,-2,0,4,6,12,34,56,88};
        int[] arr = {88,56,34,23,12,0,-2,-4,-8};
        int ans = orderAgnosticBS(arr,34);
        System.out.println(ans);
    }
}
