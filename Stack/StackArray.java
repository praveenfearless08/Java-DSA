package com.praveen.Stack;

public class StackArray {
    static int arr[];
    static int cap;
    static int top;
    StackArray(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }
     static void push(int x){
        if(top == cap-1){
            System.out.println("Stack is full!");
            return;
        }
        top++;
        arr[top] = x;
    }
    static int pop(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return Integer.MIN_VALUE;
        }
        int res = arr[top];
        top--;
        return res;
    }
    static int peek(){
        if(top == -1){
            System.out.println("Stack is Empty!");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }
    static int size(){
        return top+1;
    }
    boolean isEmpty(){
        return (top == -1);
    }
    public static void main(String[] args) {
            StackArray s = new StackArray(10);
            s.push(4);
            s.push(5);
        System.out.println(s.peek());
    }
}
