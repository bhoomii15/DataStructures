package com.bhoomi.sortingAlgos;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
//        arr = mergeSort(arr);
        mergeSortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        //base case
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0; //for arr1
        int j = 0; //for arr2
        int k = 0; //for new arr

        while(i < first.length && j < second.length ){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }


    //IN PLACE MERGE SORT
    static void mergeSortInPlace(int[] arr, int s, int e){
        //base case
        if(e - s == 1){
            return;
        }

        int mid = s + (e - s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid , e);

        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];
        int i = s; //for arr1
        int j = m; //for arr2
        int k = 0; //for new arr

        while(i < m && j < e ){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        //copying in original one
        for(int l = 0; l < mix.length; l++){
            arr[s + l] = mix[l];
        }
    }

}
