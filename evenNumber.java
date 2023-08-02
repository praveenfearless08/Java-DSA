package com.praveen;


public class evenNumber {
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }
        return count;
    }


    // function to check whether a number contains even digits or not

    static boolean even(int num) {
        int numberOfDigit = digit(num);
        return numberOfDigit % 2 == 0;
    }


    // count number of digits in a number

    static int digit(int num) {
        if (num < 0) {
            return num = num * -1;
        }
        if (num == 0) {
            return -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;

        //return (int)(Math.log10(num))+1;

    }
    public static void main(String[] args) {
        int[] nums = {2,3422,562,3222,34};
        System.out.println(findNumbers(nums));


    }
}
