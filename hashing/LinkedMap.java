package com.bhoomi.hashing;
import java.util.*;

public class LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("Bhoomi", 909);
        hm.put("Palak", 420);
        hm.put("Nishtha", 226);


        System.out.println(hm);
    }
}
