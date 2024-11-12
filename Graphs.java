import java.util.*;
class Graphs {
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] pathVisited) {
        visited[node] = 1;
        pathVisited[node] = 1;
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                if (dfsCheck(it, adj, visited, pathVisited)) {
                    return true;
                }
            }else if (pathVisited[it] == 1) {
                return true;
            }
        }
        pathVisited[node] = 0;
        return false;
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited = new int[V]; 
        int[] pathVisited = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfsCheck(i, adj, visited, pathVisited)) {
                    return true;
                }
            }
        }
        return false;
    }    
    public void printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        System.out.println("Graph (Adjacency List):");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " → ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graphs graph1 = new Graphs();
        int V1 = 4;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) {
            adj1.add(new ArrayList<>());
        }
        adj1.get(0).add(1);
        adj1.get(1).add(2);
        adj1.get(2).add(3);
        adj1.get(3).add(1);
        graph1.printGraph(V1, adj1);
        System.out.println("Graph 1 has cycle: " + graph1.isCyclic(V1, adj1));
        Graph graph2 = new Graph();
        int V2 = 3;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }
        adj2.get(0).add(1);
        adj2.get(1).add(2);
        graph2.printGraph(V2, adj2);
        System.out.println("Graph 2 has cycle: " + graph2.isCyclic(V2, adj2));
    }
}
