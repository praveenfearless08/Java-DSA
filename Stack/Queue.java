package com.praveen.Stack;

import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void engueue(int data){
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;

    }
    public int degueue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }
    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode curr = front;
        while(curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.engueue(10);
        queue.engueue(5);
        queue.print();
        queue.degueue();
        queue.print();
    }
}
