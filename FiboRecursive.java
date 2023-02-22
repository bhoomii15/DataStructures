package com.bhoomi;

public class FiboRecursive {
    public static void main(String[] args) {
        System.out.println(Fibo(5));
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){

        return (int) (Math.pow((1 + Math.sqrt(5)) / 2, n));
    }


    static int Fibo(int n){
        //base condition
        if(n < 2){
            return n;
        }

        return Fibo(n-1) + Fibo(n-2);
    }
}
