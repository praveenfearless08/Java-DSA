package com.praveen.LinkedList;

public class KthSmallestElement {
    static class Node{
        int data;
        Node left,right;
        int lCount;
        Node(int x){
            data = x;
            left = right = null;
            lCount = 0;
        }
    }
    public static Node insert(Node root, int x){
        if(root == null){
            return new Node(x);
        }
        if(x < root.data){
            root.left = insert(root.left,x);
            root.lCount++;
        }else if(root.data < x){
            root.right = insert(root.right,x);
        }
        return root;

    }
  public static Node kThSmallest(Node root, int k){
        if(root == null){
            return root;
        }

        int count = root.lCount + 1;
        if(count == k){
            return root;
        }
        if(count > k){
            return kThSmallest(root.left,k);
        }
        return kThSmallest(root.right,k - count);
  }
    public static void main(String[] args) {
            Node root = null;
            int keys[] = {20,8,22,4,15,12,16};

            for(int x: keys){
                root = insert(root,x);
            }
            int k = 4;
            Node res = kThSmallest(root,k);
            if(root == null){
                System.out.println("There are less than" + res.data + " than k Nodes in the BST");
            }else{
                System.out.println("Kth smallest element is " + res.data);
            }
    }
}
