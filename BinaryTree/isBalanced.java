package com.praveen.BinaryTree;

public class isBalanced {
    boolean isBal = true;
    public boolean isBalanced(binaryTree.TreeNode root) {
        height(root);
        return isBal;
    }
    public int height(binaryTree.TreeNode root){
        if(root == null){
            return 0;
        }


        int left= height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) > 1){
            isBal = false;
        }
        return Math.max(left,right) + 1;


    }
}
