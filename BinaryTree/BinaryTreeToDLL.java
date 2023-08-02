package com.praveen.BinaryTree;

import org.w3c.dom.Node;

public class BinaryTreeToDLL {
    binaryTree.TreeNode prev = null;
    public binaryTree.TreeNode BTTtoDLL(binaryTree.TreeNode root){
        if(root == null){
            return root;
        }
        binaryTree.TreeNode head = BTTtoDLL(root.left);
        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTTtoDLL(root.right);
        return head;


    }

    public static void main(String[] args) {



    }
}
