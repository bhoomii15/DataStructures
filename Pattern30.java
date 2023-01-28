package com.bhoomi;

public class Pattern30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n){
        //rows
        for(int row = 1; row <= n; row++){
            //cols

            int spaces = n - row;
            for(int i = 1; i<= spaces; i++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
