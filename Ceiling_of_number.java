package com.praveen;
//return the index of smallest number greater than or equal to target
public class Ceiling_of_number {

    static int ceiling(int[] arr, int target){

        //but what if target number will greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return start;   //for ceiling return start
        //return end;  // for floor return end
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = ceiling(arr,10);
        System.out.println(ans);

    }
}


