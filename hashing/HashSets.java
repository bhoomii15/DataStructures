package com.bhoomi.hashing;
import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        set.clear();
        System.out.println(set);

    }
}
