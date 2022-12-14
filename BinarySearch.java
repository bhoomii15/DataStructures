package com.bhoomi;

public class BinarySearch {

    public static void main(String[] args) {

        int [] nums = {-11 , -5, 5, 6, 88, 99, 100, 1212};
        int t = 99;

        System.out.println(BinarySearch(nums,t ));

    }

    static int BinarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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
