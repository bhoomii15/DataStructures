package com.bhoomi;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] nums = {5, 3, 4, 1, 7, 5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void insertionSort(int[]arr){

        for(int i =0; i<arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){

                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
