package com.bhoomi;

import java.util.ArrayList;

public class LinearSearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7,7};
        int target = 7;
        int goal = 10;

        System.out.println(ifFound(arr, target, 0));
        System.out.println(ifFound2(arr, target, 0));
        System.out.println(ifFound2(arr, goal, 0));
        System.out.println(findAll(nums, target, 0, new ArrayList<>()));
        System.out.println(findAll2(arr, target, 0));
    }

    static boolean ifFound(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        } else{
            return ifFound(arr, target, index + 1);
        }
    }

    static int ifFound2(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        } else{
            return ifFound2(arr, target, index+1);
        }
    }

    //returning an arraylist by adding it as a parameter
    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return findAll(arr, target, index + 1, list);
    }

    //returning arrayList without adding as a parameter
    static ArrayList<Integer> findAll2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAll2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}

