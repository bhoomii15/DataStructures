package com.bhoomi.binarySearchTree;

public class BuildBST {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static Node insert( Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.val > value){
            root.left = insert(root.left, value);
        } else{
            root.right = insert(root.right, value);
        }

        return root;

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        //case 1
        if(root == null){
            return false;
        }
        //case 2
        if(root.val == key){
            return true;
        }
        //case 3
        if(root.val > key){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 6)){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }
    }
}
