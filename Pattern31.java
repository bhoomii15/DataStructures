package com.bhoomi;

public class Pattern31 {
    public static void main(String[] args) {
        pattern30(4);
    }

    static void pattern30(int n){
        int originalN = n;
        n = 2*n;
        //rows
        for(int row = 0; row <= n; row++){
            //cols
            for(int col = 0; col <= n; col++ ){
                int value = originalN - Math.min(Math.min(row, col), Math.min(n-row, n - col));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
