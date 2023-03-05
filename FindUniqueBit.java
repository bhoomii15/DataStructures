package com.bhoomi;

public class FindUniqueBit {
    public static void main(String[] args) {
        int[] arr = {-2, 2, 3, -3, 4, -5, 5, 6, -6};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique = 0;

        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }
}
