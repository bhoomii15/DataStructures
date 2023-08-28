package com.bhoomi.graphs;

import java.lang.reflect.Array;
import java.security.interfaces.EdECKey;
import java.util.ArrayList;

public class CreatingAdjL {
    //creating class edge
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        //visit
        System.out.println(curr + " ");
        vis[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                 dfs(graph, e.dest, vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> [] graph = new ArrayList[V];
        //convert null to empty arraylist
        for(int i =0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        //0 VERTREX
        graph[0].add(new Edge(0, 1,5));

        //1 VERTEX
        graph[1].add(new Edge(1,0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //VERTEX2

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //VERTEX3
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 1, 3));

        //VERTEX4
        graph[4].add(new Edge(4, 2, 2));


        // to print 2's neighbours
        for(int i =0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

        System.out.println(hasPath(graph, 0, 9, new boolean[V]));
    }


}
