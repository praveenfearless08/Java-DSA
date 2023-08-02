package com.praveen;

public class OddEven {
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }
}
