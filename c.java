package com.praveen;

import java.util.Scanner;


public class c {
    static int divisor(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                count++;
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.print("Total count is : ");
        return count;
    }

    public static void main(String[] args) {
        int n = 48;
        System.out.println(divisor(n));

    }
}
