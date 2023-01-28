package com.bhoomi;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i =0; i< 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(25));
        System.out.println(builder.reverse());
    }
}
