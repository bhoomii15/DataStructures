package com.bhoomi;

public class SearchinRange {


    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int a = 7;
        int s = 2;
        int e = 8;

        System.out.println(linerSearch(arr, a, s, e ));

    }

    static int linerSearch(int[] arr, int target, int start, int end ){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }

}
