package com.praveen.recursion;

public class OnetoN {
    static void fun(int n){
        if(n == 0){
            return ;
        }

        fun(n-1);
        System.out.println(n);
//when the function call finish executing then print.

    }
    public static void main(String[] args) {
        fun(5);
    }
}
