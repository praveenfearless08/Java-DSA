package com.praveen.recursion;

public class CountDigits {
    static int Sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + Sum(n/10);
    }
    public static void main(String[] args) {
        int n  = 1254321;
        System.out.println(Sum(n));

    }
}
