import java.util.*;

public class Grafsalgo {

    private int vertices; // Number of vertices in the graph
    private LinkedList<Integer>[] adjList; // Adjacency list for storing graph

    // Constructor to initialize the graph with given vertices
    public Grafsalgo(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {
        adjList[source].add(destination); // Directed graph
    }

    // Breadth-First Search (BFS)
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("BFS Traversal starting from vertex " + startVertex + ":");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adjacent : adjList[vertex]) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    queue.add(adjacent);
                }
            }
        }
        System.out.println();
    }

    // Depth-First Search (DFS)
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal starting from vertex " + startVertex + ":");
        dfsRecursive(startVertex, visited);
        System.out.println();
    }

    // Helper function for DFS (Recursive)
    private void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adjacent : adjList[vertex]) {
            if (!visited[adjacent]) {
                dfsRecursive(adjacent, visited);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of vertices and edges
        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        Grafsalgo graph = new Grafsalgo(vertices);

        System.out.print("Enter number of edges: ");
        int edges = scanner.nextInt();

        // Input edges
        System.out.println("Enter the edges (source destination):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        // Input starting vertex for BFS and DFS
        System.out.print("Enter the starting vertex for BFS and DFS: ");
        int startVertex = scanner.nextInt();

        // Perform BFS and DFS
        graph.bfs(startVertex);
        graph.dfs(startVertex);

        scanner.close();
    }
}
