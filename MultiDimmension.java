package com.bhoomi;
import java.util.Arrays;
import java.util.Scanner;

//Taking 2D array input
public class MultiDimmension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        //taking input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //taking output
        /*for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }*/
/*
        for( int row = 0; row < arr.length; row ++){
            System.out.println(Arrays.toString(arr[row]));
        }*/

        //using enhanced for loop
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
