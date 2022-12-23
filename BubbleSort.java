package com.bhoomi;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void bubbleSort(int[] arr){
        //void because space complexity is constant, nothing new is being created

        boolean swapped;
        //to run the steps n-1 times
        for(int i =0; i< arr.length; i++){
            swapped = false;
            //for each step, max will come at the last respective index
            for(int j = 1; j< arr.length - i;j++){
                //swap if the item is smaller than the previous one
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i it means that arr is sorted then break
            if(!swapped){ //!false = true
                break;
            }
        }
    }
}
