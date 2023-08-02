package com.praveen;

public class SearchInsertPosition {
    static int searchPosition(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(start == end) {
            if (arr[start] < target) {
                return start + 1;
            }
        }
            return start;

        }


    public static void main(String[] args) {
        }

    }


