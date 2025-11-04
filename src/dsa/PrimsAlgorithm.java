package dsa;
import java.util.Arrays;

public class PrimsAlgorithm {
    static final int V = 4; // Number of vertices

    // Function to find the vertex with minimum key value not yet included in MST
    static int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    // Print the constructed MST
    static void printMST(int[] parent, int[][] graph) {
        int totalCost = 0;
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
            totalCost += graph[i][parent[i]];
        }
        System.out.println("Total Cost of Network: " + totalCost);
    }

    // Prim's Algorithm
    static void primMST(int[][] graph) {
        int[] parent = new int[V]; // Stores MST
        int[] key = new int[V];    // Minimum edge weight to add vertex
        boolean[] mstSet = new boolean[V]; // True if vertex is included in MST

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);

        key[0] = 0; // Start from vertex 0
        parent[0] = -1; // Root has no parent

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    public static void main(String[] args) {
        int[][] graph = new int[V][V];

        graph[0][1] = 10; graph[1][0] = 10;
        graph[0][2] = 6;  graph[2][0] = 6;
        graph[0][3] = 5;  graph[3][0] = 5;
        graph[1][3] = 15; graph[3][1] = 15;
        graph[2][3] = 4;  graph[3][2] = 4;

        System.out.println("Fibre Optic Network (Prim's Algorithm):");
        primMST(graph);
    }
}
