package com.praveen;

import com.praveen.BinarySearchTree.BinarySearchTree;
import org.w3c.dom.Node;

public class ValidBST {
    private Node root;

    private class Node{
        private int data;
        private Node left;
        private Node right;
        private Node(int data){
            this.data = data;
        }
    }

    boolean isValid(Node root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isValid(root.left, min, root.data);
        if(left){
            boolean right = isValid(root.right, root.data,max);
            return right;
        }
        return false;
    }
}
