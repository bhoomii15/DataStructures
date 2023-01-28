package com.bhoomi;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n){
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
