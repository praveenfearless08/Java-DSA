package com.praveen.recursion;

public class ProductDigits {
    static int Product(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * Product(n/10);
    }
    public static void main(String[] args) {
        int n  = 1254;
        System.out.println(Product(n));
    }
}
