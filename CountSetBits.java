package com.bhoomi;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 77;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBit(n));
    }
    
    static int countSetBit(int n){
        int count = 0; 
        while (n > 0){
            count++; 
            n = n & ( n - 1); 
        }
        
        return count; 
    }
}
