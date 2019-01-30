package com.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by u6042192 on 09-Mar-17.
 */
public class BFSGraphTraversal {
    public int v;
    public LinkedList<Integer> adj[];

    BFSGraphTraversal(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public void bfsgraph(int start) {
        boolean visited[] = new boolean[v];
        Queue queue = new LinkedList<Integer>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int n = (int) queue.poll();
            System.out.print(" " + n);
            Iterator<Integer> it = adj[n].listIterator();
            while (it.hasNext()) {
                n = it.next();
                if (!visited[n]){
                    queue.offer(n);
                    visited[n]=true;
                }

            }
        }
    }

    public static void main(String[] args) {
        BFSGraphTraversal g = new BFSGraphTraversal(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.bfsgraph(2);
    }
}
