package com.bhoomi;

public class PatternsRecursive {
    public static void main(String[] args) {
        pattern1(4, 0);
    }
    static void pattern1(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            pattern1(r, c + 1);
        } else{
            System.out.println();
            pattern1(r-1, 0);
        }
    }
}
