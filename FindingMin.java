package com.bhoomi;

public class FindingMin {

    public static void main(String[] args) {
        int [] nums = {6, 2, 1, -7, 9};
        int s = 0;
        int e = 2;

        System.out.println(minVal(nums));
        System.out.println(minRange(nums, s, e));

    }

    static int minVal(int[] arr){
        int min = arr[0];
        for(int element : arr){
            if (element < min){
                min = element;
            }
        }

        return min;
    }

    static int minRange(int[] arr, int start, int end){
        int min = arr[0];

        for (int i = start; i<=end; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
