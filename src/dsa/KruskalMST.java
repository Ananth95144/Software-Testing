package dsa;
import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, cost;
    public Edge(int src, int dest, int cost) {
        this.src = src;
        this.dest = dest;
        this.cost = cost;
    }
    public int compareTo(Edge other) {
    	System.out.println(this.cost+" "+other.cost+"-----");
        return this.cost - other.cost;
    }
}

public class KruskalMST {
    int[] parent;

    int find(int i) {
        if (parent[i] != i)
            parent[i] = find(parent[i]);
        return parent[i];
    }

    void union(int u, int v) {
        int uRoot = find(u);
        int vRoot = find(v);
        parent[uRoot] = vRoot;
    }

    void kruskal(int vertex, List<Edge> edges) {
        Collections.sort(edges);
        parent = new int[vertex];
        
        for (int i = 0; i < vertex; i++)
            parent[i] = i;

        int totalCost = 0;
        System.out.println("Edges in MST:");
        int count = 0;

        for (Edge e : edges) {
            if (find(e.src) != find(e.dest)) {
                union(e.src, e.dest);
                System.out.println(e.src + " - " + e.dest + " : " + e.cost);
                totalCost += e.cost;
                count++;
                if (count == vertex - 1) break; 
            }
        }

        System.out.println("Total Minimum Cost: " + totalCost);
    }

    public static void main(String[] args) {
        int vertex = 4;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        KruskalMST Kob = new KruskalMST();
        Kob.kruskal(vertex, edges);
    }
}
