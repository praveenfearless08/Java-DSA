package com.praveen.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // - Iterative way using Stack
    static void DFS2(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()){
            int u = stack.pop();
            if(visited[u] == false){
                visited[u] = true;
                System.out.print(u + " ");
                for(int v : adj.get(u)){
                    if(visited[v] == false){
                        stack.push(v);
                    }
                }
            }
        }
    }
    static void DFS2dis(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
            if(visited[i] == false){
                DFS2(adj,i,visited);
            }
        }
    }




    // - Recursive Way
    static void DFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited){
        visited[s] = true;
        System.out.print(s + " ");
        for(int u : adj.get(s)){
            if(visited[u] == false){
                DFS(adj,u,visited);
            }
        }
    }

    static void DFSdis(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        int count = 0;

        for (int i = 0; i < V; i++) {
            if(visited[i] == false){
                DFS(adj,i,visited);
                count++;
            }
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
          int V = 5;

          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,3,4);

        System.out.println("Following is Depth First Traversal for disconnected graphs: ");
        DFSdis(adj,V);
        System.out.println();
        DFS2dis(adj,V);
    }
}
