package com.praveen.Stack;

import java.util.Stack;

public class StockspanAlter {
    public static int[] solve(int[] arr){
        int[] span = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while(st.size() > 0 && arr[i] > st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i + 1;
            }else{
                span[i] = i - st.peek();
            }
            st.push(i);

        }
      return span;
    }
    public static void main(String[] args) {
         int[] arr = {1,2,4,3,6,7,2,6};
        int[] a = solve(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
