package com.bhoomi;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {55, 44, 33, 22, 11};
        int target = 44;
        System.out.println(bsRecursive(nums, target, 0 , nums.length -1 ));
    }

    static int bsRecursive(int[] arr, int target, int s, int e){
        //as s and e will determine the search space
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }

        if(target > arr[m]){
            return bsRecursive(arr, target, s, m-1);
        }

        return bsRecursive(arr, target, m+1, e);
    }
}
