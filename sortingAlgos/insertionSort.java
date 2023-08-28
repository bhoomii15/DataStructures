package com.bhoomi.sortingAlgos;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else{
                    break;
                }
            }
        }
    }

}
