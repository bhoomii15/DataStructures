package com.bhoomi.binarySearchTree;
import java.util.ArrayList;

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

    //print root to leaf

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("NULL");
    }
    public static void printToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        //add node to path
        path.add(root.val);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printToLeaf(root.left, path);
        printToLeaf(root.right, path);
        path.remove(path.size() - 1);


    }
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
//        if(search(root, 6)){
//            System.out.println("Found");
//        } else{
//            System.out.println("Not Found");
//        }

        printToLeaf(root, new ArrayList<>());
    }
}
