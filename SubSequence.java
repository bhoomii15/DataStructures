package com.bhoomi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//     subseq(" ", "abc");
//     System.out.println(subSeqRet(" ", "abc"));
//     subseqAscii(" ", "abc");
        System.out.println( subseqAsciiRet("", "abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p + ch, up.substring(1));
    }

    //returning an ArrayList
    static ArrayList<String> subSeqRet(String p, String up){
        //base case
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        //collect ans from left and right
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    //subsequence with ascii
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
        subseq(p + (ch + 0), up.substring(1));
    }

    //subseq with ascii returned as an arrayList
    static ArrayList<String> subseqAsciiRet(String p, String up){
        //base case
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p , up.substring(1));
        ArrayList<String> third = subseqAsciiRet((p + (ch + 0)), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
