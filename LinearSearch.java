package com.bhoomi;

public class LinearSearch {

    static int linerSearch(int[] arr, int n ){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }

        return -1;
    }

    static int linearSearch2(int[]arr, int n){

        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for( int element : arr){
            if (element == n){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linerSearch3(int []arr, int n){

        if(arr.length == 0){
            return false;
        }

        for( int element : arr){
            if (element == n){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int [] nums = {1, 56, 66, 23, 89, 11};
        int target = 99;

        System.out.println(linerSearch(nums, target));

    }
}
