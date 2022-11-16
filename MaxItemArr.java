package com.bhoomi;
import java.util.Scanner;

//max value in arr
public class MaxItemArr {
    static int MaxVal(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }

    static int MaxValRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i = start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr =  new int[5];
        //taking input
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MaxVal(arr));
        System.out.println(MaxValRange(arr,2,4));
    }
}
