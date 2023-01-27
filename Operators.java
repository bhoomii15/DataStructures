package com.bhoomi;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //196
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 1); //a1
        System.out.println("a" + 1); //a1
        System.out.println("Bhoomi" + new ArrayList<>());

        //error - sout(new Integer(77) + new ArrayList<>()
        System.out.println(new Integer(54) + "" + new ArrayList<>());
    }
}
