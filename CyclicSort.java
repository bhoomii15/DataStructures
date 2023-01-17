package com.bhoomi;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            //check if element is at correct positon or not
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
    }

     static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
