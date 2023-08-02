package com.praveen.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }
    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public void insertRec(int val, int index){

    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }




    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }


    public  void printNode( int i){
        Node temp = head;
        int length = 0;
        while(temp!= null){
            if(length == i){
                System.out.println(temp.value);
            }
            length++;
            temp = temp.next;
        }
    }

    //Question
    public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // Question - 2 Merge
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
         LL ans = new LL();

         while(f != null && s != null){
             if(f.value < s.value){
                 ans.insertLast(f.value);
                 f = f.next;
             }else{
                 ans.insertLast(s.value);
                 s = s.next;
             }
         }
         while(s != null){
             ans.insertLast(s.value);
             s = s.next;
         }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        return ans;
    }

    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.display();
//        list.duplicates();
//        list.display();

//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//
//        LL ans = LL.merge(first,second);
//        ans.display();

        LL sec = new LL();
        sec.insertFirst(1);
        sec.insertFirst(3);

        sec.insertFirst(5);
        sec.insertFirst(1);
        sec.insertFirst(7);
        sec.insertFirst(8);

    }
}
