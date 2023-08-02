package com.praveen.BinarySearchTree;

import java.util.ArrayList;

//Pair Sum with given BST
public class PairSum {
    static class Node{
        int data;
        Node left,right;
        Node(int x){
            data = x;
        }
    }
    public static ArrayList<Integer> treeToList(Node root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        treeToList(root.left,list);
        list.add(root.data);
        treeToList(root.right,list);

        return list;

    }
    public static boolean isPairPresent(Node root , int target){
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = treeToList(root, a1);

        int start = 0;
        int end = a2.size()-1;
        while(start < end){
            if(a2.get(start) + a2.get(end) == target){
                System.out.println("Pair found : " + a2.get(start) + " + " + a2.get(end) +" = " + target);
                return true;
            }
            if(a2.get(start) + a2.get(end) > target){
                end--;
            }
            if(a2.get(start) + a2.get(end) < target){
                start++;
            }
        }
        System.out.println("No such Values are present");
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(20);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(30);
        root.right.right.left = new Node(25);

        int sum=33;

        isPairPresent(root,sum);
    }
}
