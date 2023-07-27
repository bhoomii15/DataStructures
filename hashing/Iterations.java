package com.bhoomi.hashing;
import java.util.*;

public class Iterations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Bhoomi");
        set.add("Anurag");
        set.add("Bindiya");

//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        for(String name : set){
            System.out.println(name);
        }
//        System.out.println(set);

    }
}
