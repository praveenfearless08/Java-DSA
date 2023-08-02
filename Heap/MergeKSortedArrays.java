package com.praveen.Heap;
import java.util.*;

import java.util.ArrayList;

public class MergeKSortedArrays {

    // 1st Solution
    // Super Naive Solution


//    public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> arr){
//        ArrayList<Integer> res = new ArrayList<Integer>();
//
//        for(ArrayList<Integer> v: arr){
//            for(Integer x : v){
//                res.add(x);
//            }
//        }
//        Collections.sort(res);
//        return res;
//    }





    //Second Method
    //Naive sol


    public static ArrayList<Integer> merge2(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> arr3 = new ArrayList<>();
        while (arr1.size() > i && arr2.size() > j) {
            if (arr1.get(i) > arr2.get(j)) {
                arr3.add(arr2.get(j++));
            } else {
                arr3.add(arr1.get(i++));
            }
        }
        while (i < arr1.size()) {
            arr3.add(arr1.get(i++));
        }
        while (j < arr2.size()) {
            arr3.add(arr2.get(j++));

        }
        return arr3;
    }
    public static ArrayList<Integer> mergeKArray(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> res = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            res = merge2(res,arr.get(i));
        }
        return res;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        arr.add(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(15);
        arr.add(a2);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(9);
        a3.add(11);
        a3.add(18);
        arr.add(a3);
      //  ArrayList<Integer> res = merge(arr);
        ArrayList<Integer> res = mergeKArray(arr);

        System.out.println("Merged array is " );
        for (int x : res)
            System.out.print(x + " ");
    }
}
