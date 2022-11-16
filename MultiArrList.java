package com.bhoomi;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiArrList {
    public static void main(String[] args) {
        //syntax
        //this is an empty list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //initialisation or adding a list
        for(int i = 0; i< 3; i++){
            list.add(new ArrayList<>());
        }

        //adding elements
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
