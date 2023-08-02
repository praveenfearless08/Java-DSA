package com.praveen.Stack;

import java.util.ArrayList;

public class StackArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    static void push(int x){
        list.add(x);
    }
    static int pop(){
        int res = list.get(list.size()-1);
        list.remove(list.size()-1);
        return res;
    }
    static int peek(){
        return list.get(list.size()-1);
    }
    static int size(){
        return list.size();
    }
    static boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main(String[] args) {
        StackArrayList list = new StackArrayList();
        list.push(10);
        list.push(12);
        System.out.println(list.peek());
    }

}
