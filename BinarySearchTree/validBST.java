package com.praveen.BinarySearchTree;

public class validBST {
    private Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int x){
             data = x;
             left = right = null;
        }
    }

    // Brute force method O(n) - time
    public static boolean isBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        return (root.data > min &&
                root.data < max &&
                isBST(root.left,min,root.data) &&
                isBST(root.right,root.data,max));
    }

    //Optimised solution O(H) - time
    static int prev = Integer.MIN_VALUE;
    public static boolean isBST2(Node root){
        if(root == null){
            return true;
        }
        if(isBST2(root.left) == false){
            return false;
        }
        if(root.data <= prev){
            return false;
        }
        prev = root.data;
        return isBST2(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

        if (isBST2(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
