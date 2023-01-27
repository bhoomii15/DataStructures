package com.bhoomi;

public class ComparisonString {
    public static void main(String[] args) {
        String a = "bhoomi";
        String b = "bhoomi";

        System.out.println(a == b);

        String n1 = new String("sharma");
        String n2 = new String("sharma");
        System.out.println(n1 == n2);

        System.out.println(n1.equals(n2));
        System.out.println(n2.charAt(1));
    }
}
