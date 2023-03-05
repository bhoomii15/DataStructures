package com.bhoomi;

import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class PalindromeRecur {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+ 1;
        return helper(n, digits);
    }
    static boolean isPalindrome(int n){
return (n == rev2(n));
    }
    private static int helper(int n, int digits){
        if( n % 10 == n){
            return n;
        }
        int rem = n % 10;

        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }
}

