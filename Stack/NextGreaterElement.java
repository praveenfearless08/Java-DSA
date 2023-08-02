package com.praveen.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
        public static int[] solve2(int[] arr){
            int[] nge = new int[arr.length];
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for (int i = 1; i < arr.length; i++) {
                while(st.size() > 0 && arr[i] >arr[st.peek()]){
                     int pos = st.peek();
                     nge[pos] = arr[pos];
                     st.pop();
                }
               st.push(i);

            }
            while(st.size() > 0){
                int pos = st.peek();
                nge[pos] = -1;
                st.pop();
            }

            return nge;
        }

    public static void main(String[] args) {
         int[] arr = {2,3,4,1,9,6};
         int[] a = solve2(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }


    }
}
