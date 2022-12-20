package com.bhoomi;

public class InfiniteArray {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;

        System.out.println(findingRange(arr, target));

    }

    static int findingRange(int[] arr, int target){
        //first we'll find the range
        //first we start with a box of 2
        int start = 0;
        int end  = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }

        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {

                start = mid + 1;
            } else return mid;

        }

        return -1;
    }


}
