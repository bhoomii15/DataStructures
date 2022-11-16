package com.bhoomi;

import java.util.Arrays;

//reversing an array using swap
public class ReverseArr {
    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void revArr(int[] arr){
        //first index
        int start = 0;
        //last index
        int end = arr.length -1;

        while(start<end){
            swap(arr, start, end);
            start ++ ;
            end -- ;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] nums = {1, 2, 3, 4, 5, 6};

        revArr(arr);
        System.out.println(Arrays.toString(arr));
        revArr(nums);
        System.out.println(Arrays.toString(nums));

     }
}
