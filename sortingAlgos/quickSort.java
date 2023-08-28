package com.bhoomi.sortingAlgos;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2,1};
        quickSort(arr,0, arr.length - 1 );
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high){
         if(low >= high){
             return;
         }

         int s = low;
         int e = high;
         int m = s + (e - s)/2;
         int pivot = nums[m];

         while(s <= e){
             //reason why the array will not swap after it is sorted, unlike merge sort
             while(nums[s] < pivot){
                 s++;
             }

             while(nums[e] > pivot){
                 e--;
             }

             if(s <= e){
                 int temp = nums[s];
                 nums[s] = nums[e];
                 nums[e] = temp;
                 s++;
                 e--;
             }
             //after above step, pivot is at correct index, now you have to sort the 2 halves
             quickSort(nums, low, e );
             quickSort(nums, s, high);

         }
    }
}
