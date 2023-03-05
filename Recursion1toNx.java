package com.bhoomi;

public class Recursion1toNx {
    public static void main(String[] args) {
//        fun(6);
//        funRev(5);
        funBoth(6);
    }

    static void fun(int n){
        if(n == 0){
            return; //dont do anything
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n){
        if(n == 0){
            return; //dont do anything
        }
        funRev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }
}
