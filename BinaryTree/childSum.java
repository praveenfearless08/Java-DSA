package com.praveen.BinaryTree;

public class childSum {
    public boolean childSum(binaryTree.TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left == null &&  root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left != null){
            sum = sum + root.left.data;
        }
        if (root.right != null) {
            sum = sum + root.right.data;
        }
        return root.data == sum && childSum(root.left) && childSum(root.right);
    }

}
