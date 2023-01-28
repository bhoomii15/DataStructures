package com.bhoomi;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n){
        //outer loop
        for(int row = 1; row <= n; row++){
            //inner loop
            for(int col = 1; col<= n - row + 1; col++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
