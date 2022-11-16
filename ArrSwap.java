package com.bhoomi;
import java.util.Arrays;
import java.util.Scanner;

public class ArrSwap {

    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        swap(arr, 3, 4);
        System.out.println(Arrays.toString(arr));

    }
}
