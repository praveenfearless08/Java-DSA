package com.praveen.LinkedList;

public class LL2 {
    Node head;
    private int size;

    LL2() {
        size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
        public Node(String data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }
    //add Last
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=  null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //Insert at particular index
//    public void insert(String val, int index){
//        if(index == 0){
//            addFirst(val);
//            return;
//        }
//        if(index == size){
//            addLast(val);
//            return;
//        }
//        Node temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//        Node node = new Node(val,temp.next);
//        temp.next = node;
//        size++;
//    }
    //print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode !=  null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL ");
    }


    //delete the first node
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // delete the last Node
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }



    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }

}
