package com.praveen.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSdis {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u +" ");
            for(int v : adj.get(u)){
                if(visited[v] == false){
                 visited[v] = true;
                 q.add(v);
                }
            }
        }
    }
    static void BFSDis(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if (visited[i] == false){
                BFS(adj,i,visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);
        System.out.println("Breadth First Search of Disconnected Adjacency List");
        BFSDis(adj,V);

    }
}
