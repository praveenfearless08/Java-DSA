package com.praveen;
import java.util.*;


public class b {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i;
        for (i = 0; i < nums1.length -1; i++) {
            for (int j = 0; j < nums2.length - 1; j++) {
                if (i > m) {
                    if (nums1[i] > nums2[j]) {
                        nums1[i] = nums2[j];
                    }
                } else {
                    nums1[i] = nums2[j];
                }
            }

        }
        return new int[]{nums1[i]};

    }


    public static int lengthOfLastWord(String s) {
            int count = 0;
            int i = 0;
            while(s.length() != i){
                if(s.charAt(i) == ' '){
                    count = 0;
                    i++;
                    continue;
                }else{
                    count++;
                }
              i++;
            }
            return count;
        }


    public static void main(String[] args) {
            String s = "hello world hii";
        System.out.println(lengthOfLastWord(s));

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        System.out.println(merge(nums1,3,nums2,3));
    }




    }


