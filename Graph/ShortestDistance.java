package com.praveen.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// shortest distance in an unweighted graph
public class ShortestDistance {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj, int s, int V, int[] dist){
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
            visited[i] = false;
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()){
            int u = q.poll();
            for(int v : adj.get(u)){
                if(!visited[v]){
                    dist[v] = dist[u]+1;
                    visited[v] = true;
                    q.add(v);
                }
            }
        }

    }
    public static void main(String[] args) {
                int V = 4;
                ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        BFS(adj,0,V,dist);
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
    }
}
