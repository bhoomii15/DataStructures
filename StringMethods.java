package com.bhoomi;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Bhoomi Sharma" ;
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('o'));
        System.out.println("  Bhoomi  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
