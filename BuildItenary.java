package com.bhoomi;
import java.util.*;

public class BuildItenary {
    //to find starting point
    //build a rev hashmap

    public static String getStart(HashMap<String, String> map ){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : map.keySet()){
            revMap.put(map.get(key) , key);
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("CNN", "BLR");
        map.put("BLR", "DEL");
        map.put("GOA", "CNN");
        map.put("DEL", "GOA");

        String start = getStart(map);
        System.out.println(start);
        for(String key : map.keySet()) {
            System.out.print("-->" + map.get(start));
            start = map.get(start);
        }

        System.out.println();
    }



}
