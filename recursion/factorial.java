package com.praveen.recursion;

public class factorial {
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);

    }
}


