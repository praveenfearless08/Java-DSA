package com.praveen;

public class InfiniteArray {
    static int findingRange(int[] arr,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end+1; // this is my new start
            //double the box value
            //end = previous one + sizeofbox*2
            end = end + (end - start + 1)*2;
            start = temp;


        }
        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {


        while (start <= end) {
//       int mid = (start+end)/2; //might be possible that it gives error when sum increase the size limit of an integer.
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        int[] arr = {2,4,7,8,12,34,56,76,88,98,122,344,566};
        int target = 88;
            System.out.println(findingRange(arr,target));

    }
}
