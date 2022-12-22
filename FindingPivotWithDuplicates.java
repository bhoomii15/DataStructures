package com.bhoomi;

public class FindingPivotWithDuplicates {
    public static void main(String[] args) {

        int[] nums = { 2 ,2, 9, 2, 2, 2, };
        System.out.println(findPivot(nums));
    }

    static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //Case 1
            if( mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            //Case 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            //if elements at start, middle and end are same then just ignore the duplicates as much as you can
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //what if elements at start or end are pivots?
                //check here
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]){
                    return end;
                }
                end-- ;
            }
            else if( arr[start] < arr[mid] || (arr[start] == arr[mid] || arr[mid] > arr[end])){
                //left hand side is sorted, search in right
                start = mid + 1;
            } else{
                end = mid -1;
            }
        }

        return -1;
    }
}
