package com.bhoomi;

public class IsPowOf2 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowof2(n));
        System.out.println(isPower2(52));
    }

    static boolean isPowof2(int n){
        int count = 0;

        while(n > 0){
            n = n >> 1;
            if(n == 1){
                count++;
            }
        }

        return (count == 1);
    }

    static boolean isPower2(int n){
        int ans  = n & ( n - 1);
        return (ans == 0);
    }
}
