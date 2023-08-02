package com.praveen;

public class search_in_range {
   static int  searchInRange(int[] arr, int target, int start, int end){
    if(arr.length == 0){
        return -1;
    }
       for (int i = start; i < end; i++) {
           if(arr[i] == target){
               return i;
           }
       }
           return -1;
       }


        
    public static void main(String[] args) {
        int[] arr = {2,4,5,22,31,9};
        int target = 4;
        int ans = searchInRange(arr,4,1,4);
        System.out.println(ans);
    }
}
