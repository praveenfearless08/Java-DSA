package com.praveen;

public class FindUnique {
    static int ans(int[] arr){
        int unique = 0;
        for (int n:arr) {
            unique ^= n;

        }
        return unique;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4,4};
        System.out.println(ans(arr));

    }
}
