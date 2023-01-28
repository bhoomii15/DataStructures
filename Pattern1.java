package com.bhoomi;

public class Pattern1 {
    public static void main(String[] args) {

        pattern1(5);
    }

    static void pattern1(int n){
        //decide outer loop
        for(int row = 1; row <= n; row++){
            //figure out inner loop
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            //print a new line
            System.out.println();
        }
    }
}
