package com.bhoomi.binaryTrees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){
    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //inserting elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to add to the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to add to the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    public void display(){
        display(root,  "");
    }

    private void display(Node node, String indent) {
        if(node == null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right ,  indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node == null){
            return;
        }
        prettyDisplay(node.right, level + 1);

        if(level != 0){
            for(int i = 0; i < level - 1; i++){
                System.out.print("|\t\t");
            }
            System.out.println(" |-------> " + node.value);
        } else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public void preOrder(Node node){
        if(node  == null) {
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node){
        if(node  == null) {
            return;
        }

        preOrder(node.left);
        System.out.println(node.value + " ");
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node  == null) {
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");

    }
}
