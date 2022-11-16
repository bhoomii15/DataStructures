package com.bhoomi;

public class ColNoFixed {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3, 4},
                {3, 2, 1},
                {2,1}
        };

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
