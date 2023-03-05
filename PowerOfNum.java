package com.bhoomi;

public class PowerOfNum {
    public static void main(String[] args) {
        int base = 5;
        int power = 5;
        int ans = 1;

        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}
