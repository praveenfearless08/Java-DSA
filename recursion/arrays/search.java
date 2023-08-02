package com.praveen.recursion.arrays;
import java.util.ArrayList;
public class search {
    static boolean find(int[] arr, int target, int index){
        //Base condition
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    //find index
    static int findIndex(int[] arr, int target, int index){
        //Base condition
        if(index == arr.length){
            return -1;
        }
        if( arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }


    }
    //FindAllIndex
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        //Base condition
        if(index == arr.length){
            return ;
        }
        if( arr[index] == target){
            list.add(index);
        }

         findAllIndex(arr,target,index+1);



    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index,ArrayList<Integer> list){
        //Base condition
        if(index == arr.length){
            return list;
        }
        if( arr[index] == target){
            list.add(index);
        }

        return findAllIndex2(arr,target,index+1,list);



    }
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        //Base condition
        if(index == arr.length){
            return list ;
        }
        if( arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6,7,9};
        int target = 4;
        System.out.println(findIndex(arr,target,0));
        findAllIndex(arr,target,0);
        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        findAllIndex2(arr,4,0,list);
        System.out.println(findAllIndex3(arr,4,0));
    }
}
