package com.bhoomi;

public class RotationCount {
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(nums);
        int ans = pivot + 1;

        System.out.println(ans);

    }

    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //Case 1
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            //Case 2
            if(arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            //Case 3
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            //Case 4
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
