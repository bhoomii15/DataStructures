package com.bhoomi.sortingAlgos;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 2, 1, 4};
//        bubble(arr);
        bubbleRecursive(arr, 4, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swap = false; 
        //the loop runs n - 1 times
        for(int i = 0; i  < arr.length; i++){
            //inner loop has to ignore the last sorted elements
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }

            if(!swap){
                break;
            }
        }
    }

    static void bubbleRecursive(int[] arr, int i, int j){
        if(i == 0){
            return;
        }

        if(j < i){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

            bubbleRecursive(arr, i , j + 1);
        } else{
            bubbleRecursive(arr, i - 1, 0);
        }

    }

}
