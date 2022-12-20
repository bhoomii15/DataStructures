package com.bhoomi;

public class FloorOfNum {

    public static void main(String[] args) {

        int[] nums = { 2, 3, 5, 9, 14, 16, 18, 22};
        int target = 13;
        int goal = 1;

        System.out.println(floorNum(nums, target));
        System.out.println(floorNum(nums, goal));
    }

    static int floorNum(int [] arr, int target){

        int start = 0;
        int end = arr.length -1;

        if(target < arr[start]){
            return -1;
        }

        while(start<= end){

            int mid = start + (end -start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if(target< arr[mid]){
                end = mid - 1;
            } else{
                return mid;
            }
        }

        return end;
    }
}
