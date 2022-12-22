package com.bhoomi;

import java.util.Arrays;

public class BinarySearchin2DArrays {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 29)));


    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r< matrix.length && c>=0){

            //case 1
            if(matrix[r][c] == target){
                return new int[] {r, c};
            }
            //case 2
            if(matrix[r][c] > target){
                c--;
            } else{ //matrix[r][c] < target
                r++ ;
            }
        }

        return new int[] {-1, -1};
    }

}
