package com.bhoomi.hashing;

import java.util.*;

public class Intro {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //insert
        hm.put("India", 100);
        hm.put("China", 200);
        System.out.println(hm);
        System.out.println(hm.size());

        //get
         int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Atlanta"));

        //conatinsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Artica"));

        //remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }




}
