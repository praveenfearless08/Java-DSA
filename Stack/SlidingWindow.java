package com.praveen.Stack;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindow {

    public static void main(String[] args) {
    int[] arr = {2,5,9,6,8,9,11,12,1,6,5};

        // next greater
        Stack<Integer> st = new Stack<>();
        st.push(arr.length -1 );
        int[] nge = new int[arr.length];
        nge[arr.length-1] = arr.length;

        for (int i = arr.length-2; i >= 0; i--) {

            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = arr.length;
            }else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        // enter the loop to find the maximum of slidiing window at i
        // K is window size
        int j = 0;
        int k = 4;
        for (int i = 0; i <= arr.length - k; i++) {

            if(j < i){
                j = i;
            }
            while(nge[j] < i + k){
                j = nge[j];
            }
            System.out.println(arr[j]);
        }

    }
}
