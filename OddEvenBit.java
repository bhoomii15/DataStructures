package com.bhoomi;

public class OddEvenBit {
    public static void main(String[] args) {
        int n = 68;
        int m = 69;
        System.out.println(isOdd(m));
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return ((n & 1) == 1);
    }
}
