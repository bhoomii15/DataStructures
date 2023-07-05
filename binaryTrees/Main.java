package com.bhoomi.binaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bst tree = new Bst();
        int[] nums = {1,2,3,4,5,6,7,8};
//        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populateSorted(nums);
        tree.display();
//        BinaryTree tree = new BinaryTree();
//        tree.populate(sc);
//        tree.prettyDisplay();
    }
}
