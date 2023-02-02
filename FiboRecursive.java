package com.bhoomi;

public class FiboRecursive {
    public static void main(String[] args) {
        System.out.println(Fibo(5));
    }

    static int Fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }

        return Fibo(n-1) + Fibo(n-2);
    }
}
