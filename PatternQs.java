package com.bhoomi;

public class PatternQs {
    public static void main(String[] args) {
//
//        pattern6(5);
//        pattern7(5);
        pattern8(5);

    }

    static void pattern6(int n){
        //rows
        for(int i = 1; i <= n; i++){
            int spaces = n - i;
                for(int k = 1; k <= spaces; k++){
                    System.out.print(" ");
                }
            //cols
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int i = 1; i<=n ; i++){
            int cols = n + 1 -i;
            int spaces = n - cols;
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<= cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i = 1; i<=n; i++){
            int cols = 2*i - 1;
            int spaces = n - cols;
            for(int k =1; k<= spaces; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<= cols; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
