package com.bhoomi;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int [] nums = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;

        int ans = search(nums, target);
        System.out.println(ans);
        /*System.out.println(search(nums, goal));*/

    }


    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) /2 ;

            //3 cases possible
            if( arr[mid] == target){
                return mid;
            }

            if(isAsc){

                if(target > arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1 ;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
