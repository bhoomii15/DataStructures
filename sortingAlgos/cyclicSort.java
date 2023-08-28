package com.bhoomi.sortingAlgos;

import java.util.Arrays;

public class cyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        //check, swap, move
        int i = 0;
        while(i  < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

}
