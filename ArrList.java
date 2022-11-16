package com.bhoomi;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        //Syntax

        ArrayList<Integer> nums = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

/*
        nums.add(12);
        nums.add(56);
        nums.add(45);
        nums.add(75);
        nums.add(56);
        nums.add(89);

        System.out.println(nums);
        nums.set(2, 78);
        nums.remove(3);
        System.out.println(nums);*/

        //taking input
        for(int i =0; i < 5; i++){
            nums.add(sc.nextInt());
        }
        for(int i =0; i < 5; i++){
            System.out.println(nums.get(i));
        }
    }
}
