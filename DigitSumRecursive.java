package com.bhoomi;

public class DigitSumRecursive {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(345));
    }
    static int sumOfDigits(int n){
        if( n == 0){
            return 0;
        }

        return (n % 10) + sumOfDigits(n/10);
    }
}
