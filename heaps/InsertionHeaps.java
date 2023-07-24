package com.bhoomi.heaps;

import javax.swing.*;
import java.util.ArrayList;

public class InsertionHeaps {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int val) {
            // add at last index
            arr.add(val);

            int x = arr.size() - 1; //child index
            int par = (x - 1) / 2; //parent index

            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(x, temp);

                x = par;
                par = (x - 1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            //to know if you are at a leaf node or not
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            //swap
            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int val = arr.get(0);

            //step 1 swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //step2
            arr.remove(arr.size() - 1);

            //step3
            heapify(0);
            return val;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

        public static void main(String[] args) {
            Heap h = new Heap();
            h.add(4);
            h.add(3);
            h.add(1);
            h.add(2);
            h.add(5);

            while(!h.isEmpty()){
                System.out.println(h.peek());
                h.remove();
            }
        }
}
