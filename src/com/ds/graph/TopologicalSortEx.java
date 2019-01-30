package com.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class Graph{
    private int V;
    private LinkedList<Integer> adj[];
    private Boolean visited[];

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        visited=new Boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int v,int w){
        adj[v].add(w);
    }
    public Stack<Integer> topologicalSort(){

        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        Stack<Integer> stack=new Stack<>();

        for (int i=0;i<V;i++){
            if(visited[i]==false){
                topologicalSortUtil(i,stack,visited);
            }
        }
        return stack;
    }
    private void topologicalSortUtil(int i,Stack<Integer> stack,Boolean visited[]){

        visited[i]=true;

        Iterator<Integer> it=adj[i].iterator();
        while (it.hasNext()){
            int n=it.next();
            if(!visited[n])
                topologicalSortUtil(n,stack,visited);
        }
        stack.push(i);
    }
}

public class TopologicalSortEx {
    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        g.topologicalSort().forEach(System.out::println);
    }
}
