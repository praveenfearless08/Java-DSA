package com.praveen;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    // Normal Method
    public static int intersection2(int arr1[], int n, int arr2[], int m){
        int count = 0;
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<Integer>();
        while(i < n && j < m){
            if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                count++;
                i++;
                j++;
            }

        }

        return count;
    }

    // Method Using Hashset
    public static int intersection(int arr1[], int n, int arr2[], int m){
        int count = 0;
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<Integer>();
        while(i < n && j < m){
            if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                set.add(arr2[j++]);
                i++;
            }

        }

        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int n = arr1.length;

        int arr2[] = {1,2,3};
        int m = arr2.length;

        int ans =  intersection2(arr1,n,arr2,m);

        System.out.println(ans);

    }
}
