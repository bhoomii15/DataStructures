package com.bhoomi;

public class StringPerformance {
    public static void main(String[] args) {
        String alphabet = "";
        for(int i=0; i< 26; i++){
            char ch = (char)('a' + i);
            alphabet += ch;
        }
        System.out.println(alphabet);
    }
}
