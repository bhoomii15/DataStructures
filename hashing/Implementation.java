package com.bhoomi.hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> [] buckets;

        @SuppressWarnings("unchecked")
        public  HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i < 4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        //hash function
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        //searching in LL
        private int searchLL(K key, int bi){
            LinkedList<Node> l = buckets[bi];
            int di = 0;

            for(int i =0; i < l.size(); i++){
                Node node = l.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        //rehashing
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i =0; i < oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0; j < ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        //put
        public void put(K key, V value){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di != -1){ //updation
                Node node = buckets[bi].get(di);
                node.value = value;
            } else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean constainsKey(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di != -1){
                return true;
            } else{
                return false;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else{
                return null;
            }
        }

        public V remove (K key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--; // as a node is being removed
                return node.value;
            } else{
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> l = buckets[i];
                for(Node node : l){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public static void main(String[] args) {
            HashMap<String, Integer> hm = new HashMap<>();
            hm.put("India", 100);
            hm.put("China", 150);
            hm.put("USA", 50);
            hm.put("Canada", 70);

            ArrayList<String> keys = hm.keySet();
            for(String key : keys){
                System.out.println(key);
            }

            System.out.println(hm.get("India"));
            System.out.println(hm.remove("India"));
            System.out.println(hm.get("India"));
        }

    }
}
