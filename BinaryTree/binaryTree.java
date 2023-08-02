package com.praveen.BinaryTree;

import java.util.*;

public class binaryTree {
    private TreeNode root;

    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int data;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    public void createTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(8);
        TreeNode eighth = new TreeNode(1);


        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        fifth.left = sixth;
        fifth.right = seventh;
        third.right = eighth;
    }

//    public void preOrder(TreeNode root){
//        if(root == null){
//            return;
//        }
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//
//    }

    public void preOrder() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        System.out.println();
    }

//    public void inOrder(TreeNode root){
//        if(root == null){
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.data + " ");
//        inOrder(root.right);
//    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
        System.out.println();
    }

    //    public void postOrder(TreeNode root){
//        if(root == null){
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data + " ");
//    }
    public void postOrder(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }

                } else {
                    current = temp;
                }
            }
        }
        System.out.println();
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        System.out.println();
    }

    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));

    }

    public void printAtKDist(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
        } else {
            printAtKDist(root.left, k - 1);
            printAtKDist(root.right, k - 1);
        }

    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return 1 + rightDepth;
        }
        if(root.right == null){
            return 1 + leftDepth;
        }
        return Math.min(leftDepth, rightDepth) + 1;

    }

    public int size(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + size(root.left) + size(root.right);
        }

    }
    // find maximum value in Binary Tree
    public int getMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(root.data,Math.max(getMax(root.left),getMax(root.right)));
        }
    }

    // find maximum value in Binary Tree
    public int getMax2(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = getMax2(root.left);
        int right = getMax2(root.right);
        if(left > result){
            result = left;
        }if(right > result){
            result = right;
        }
        return result;
    }

    //child sum property - root node should equal to sum of their child nodes
    public boolean childSum(TreeNode root){
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
    public int maxWidth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int result = 0;

            while(!queue.isEmpty()){
                int count = queue.size();
                 result = Math.max(result, count);
                 for (int i = 0; i < count; i++){
                     TreeNode curr = queue.poll();
                     if(curr.left != null){
                         queue.add(curr.left);
                     }
                     if(curr.right != null){
                         queue.add(curr.right);
                     }
                 }
        }
        return result;

    }
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
    public void printList(TreeNode head){
        TreeNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
        System.out.println();

    }
    public  void printLeft(TreeNode root){
        if(root==null)
            return;
        Queue<TreeNode> q=new LinkedList<>();q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                if(i==0)
                    System.out.print(curr.data+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
    public void printSpiral(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean rev = false;

        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();

            for (int i = 0; i < q.size(); i++) {
                TreeNode curr = q.poll();
                if(rev){
                    s.push(curr.data);
                }else {
                    System.out.print(curr.data + " ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }



            }
            if(rev){
                while(!s.isEmpty()){
                    System.out.print(s.pop() + " ");
                }
            }
            rev = !rev;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.createTree();
//        // tree.preOrder(tree.root);
//        tree.preOrder();
//         tree.inOrder(tree.root);
//        tree.inOrder(tree.root);
//        tree.postOrder(tree.root);
//        // System.out.print(tree.height(tree.root));
//        // tree.printAtKDist(tree.root,2);
        tree.levelOrder();
//        System.out.println(tree.size(tree.root));
//        System.out.println(tree.getMax(tree.root));
//        System.out.println(tree.getMax2(tree.root));
//        System.out.println(tree.childSum(tree.root));
//        System.out.println(tree.maxWidth(tree.root));
//        TreeNode head = tree.BTTtoDLL(tree.root);
//        tree.printList(head);
//        tree.printLeft(tree.root);
//        tree.printSpiral(tree.root);
    }
}
