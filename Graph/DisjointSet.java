package com.praveen.Graph;
import java.util.*;
import java.io.*;
public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n){
        for(int i = 0; i < n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findPar(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findPar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionByRank(int u, int v){
        int ulp_u = findPar(u);
        int ulp_v = findPar(v);
        if(ulp_u == ulp_v) return;
        if(rank.get(ulp_u) < rank.get(v)){
            parent.set(ulp_v,ulp_u);
        }else if(rank.get(v) < rank.get(u)){
            parent.set(ulp_u,ulp_v);
        }else{
            parent.set(ulp_v,ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u,rankU+1);
        }
    }
    public void unionBySize(int u, int v){
        int ulp_u = findPar(u);
        int ulp_v = findPar(v);
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u) + size.get(ulp_v));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u) + size.get(ulp_v));
        }
    }
    public static void main(String[] args) {
       DisjointSet ds = new DisjointSet(8);
//        ds.unionByRank(1,2);
//        ds.unionByRank(2,3);
//        ds.unionByRank(4,5);
//        ds.unionByRank(6,7);
//        ds.unionByRank(5,6);

        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);

        if(ds.findPar(3) == ds.findPar(7)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
//        ds.unionByRank(3,7);
        ds.unionBySize(3,7);


        if(ds.findPar(3) == ds.findPar(7)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
