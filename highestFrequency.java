package com.praveen;
import java.util.*;

public class highestFrequency {
    public static int[] frequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int frequency = 0;
        int index = 0;
        int[] array = new int[map.size()];
       for(Map.Entry<Integer, Integer> map2: map.entrySet()){
           int  element = map2.getValue();
            int ind = map2.getKey();
           array[index] = ind;
           index++;
//            if( element > frequency){
//                frequency = element;
//
//            }

        }
       Arrays.sort(array);
       int val = 0;
       int i = array.length-1;
       int[] ans = new int[5];
       while(val < 5){
           ans[val++] = array[i++] ;
       }

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,2,4,6,1,2,4,6,7,2,3,1,2};
        System.out.println(frequency(arr));

     }
}
