package com.praveen.BinarySearchTree;
//Fix a BST with Two node swapped
public class FixBST {
    static class Node{
        int data;
        Node left, right;
        Node(int x){
            data = x;
            left = right = null;
        }
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    static Node prev = null, first = null, second = null;
    public static void fixBST(Node root){
        if(root == null){
            return;
        }
        fixBST(root.left);
        if(prev!= null && root.data < prev.data){
            if(first == null)
                first = prev;
            second = root;
        }
        prev = root;
        fixBST(root.right);
        }

    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(60);
        root.right = new Node(70);
        root.left.left = new Node(4);
        root.right.left = new Node(8);
        root.right.right = new Node(80);

        inorder(root);
        System.out.println();;
        fixBST(root);
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
        inorder(root);
    }

    }

