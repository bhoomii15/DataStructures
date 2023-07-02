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
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to add to the right of " + node.value);
            int value = scanner.nextInt();
            populate(scanner, node.right);
        }

    }

}
