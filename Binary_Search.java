package com.praveen;

public class Binary_Search {
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//       int mid = (start+end)/2; //might be possible that it gives error when sum increase the size limit of an integer.
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {-12,-6,0,2,3,6,8,12,24,56};
        int ans =  binarySearch(arr,-12);
        System.out.println(ans);
    }
}
