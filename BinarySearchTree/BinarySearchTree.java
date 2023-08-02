package com.praveen.BinarySearchTree;

public class BinarySearchTree {

    private Node root;

    private class Node{
        private int data;
        private Node left;
        private Node right;
        private Node(int data){
            this.data = data;
        }
    }


    //To insert in Binary Search Tree
    public void insert(int value){
        root = insert(root,value);
    }
    public Node insert(Node root, int value){
          if(root == null){
              root = new Node(value);
              return root;
          }
          if(value < root.data){
              root.left = insert(root.left,value);
          }else{
              root.right = insert(root.right,value);
          }
          return root;
    }

    public Node search(int val){
        return search(root,val);
    }
    public Node search(Node root, int val){
        if(root == null || root.data == val){
            return root;
        }
        if(val < root.data){
            return search(root.left, val);
        }
        else{
            return search(root.right, val);

        }
    }

    // Deletion of BST
    public  Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }

    public  Node delNode(Node root, int x){
        if(root==null)
            return root;
        if(root.data>x)
            root.left=delNode(root.left,x);
        else if(root.data<x)
            root.right=delNode(root.right,x);
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node succ=getSuccessor(root);
                root.data=succ.data;
                root.right=delNode(root.right,succ.data);
            }
        }
        return root;
    }

    //Floor of BST

    public Node floor(Node root, int x){
        Node res = null;
        while(root != null){
            if(root.data == x){
                return root;
            }else if(root.data > x){
                root = root.left;
            }else{
                res = root;
                root = root.right;
            }
        }
        return res;
    }

    //Ceil IN BST

    public Node ceil(Node root, int x){
        Node res = null;
        while(root != null){
            if(root.data == x){
                return root;
            }else if(root.data < x){
                root = root.right;
            }else{
                res = root;
                root = root.left;
            }
        }
        return res;
    }


    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
        bst.insert(1);
        bst.insert(7);
        bst.search(6);
       // bst.delNode(bst.root, 1);
        System.out.println(bst.floor(bst.root, 2).data);
        System.out.println(bst.ceil(bst.root,4).data);
      //  bst.inOrder(bst.root);


//        if(bst.search(8) != null){
//            System.out.println("Key Found");
//        }else{
//            System.out.println("Key Not Found");
//        }

    }
}
