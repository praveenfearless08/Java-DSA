package com.praveen.LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertLast(34);
        list.insertLast(23);
        list.insert(12,2);

        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertLast(1);
//        list.insert(1,12);
//        list.display();

//      CLL list = new CLL();
//        list.insert(23);
//        list.insert(12);
//        list.insert(19);
//        list.insert(22);
//        list.insert(21);
//        list.delete(19);
//        list.display();

        SinglyLinkedList list2 = new SinglyLinkedList();


    }
}
