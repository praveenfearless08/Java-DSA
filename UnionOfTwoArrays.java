package com.praveen;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    //Wrong method
    public static int union(int arr1[], int n, int arr2[], int m){
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < n && j < m){
            if(arr1[i] > arr2[j]){
                count++;
                j++;
            }
            if(arr1[i] < arr1[j]){
                count++;
                i++;
            }
            if(arr1[i] == arr2[j]){
                count++;
                i++;
                j++;
            }
        }
        while(i < n){
            i++;
            count++;
        }
        while(j < n){
            j++;
            count++;
        }
        return count;
    }

    // correct method using hashset
    public static int union2(int[] arr1, int n, int[] arr2, int m){

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < m; j++) {
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int n = arr1.length;

        int arr2[] = {1,2,3};
        int m = arr2.length;

       int ans =  union2(arr1,n,arr2,m);

        System.out.println(ans);

    }
}
