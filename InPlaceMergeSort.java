package com.bhoomi;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        mergeSortinPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortinPlace(int[] arr, int s, int e){
        if( e - s == 1){ //length
            return;
        }
        int mid = (s + e)/2;

        mergeSortinPlace(arr, s, mid );
        mergeSortinPlace(arr, mid, e);
        
        mergeInPlace(arr, s, mid , e);
        
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while( i < mid && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
}
