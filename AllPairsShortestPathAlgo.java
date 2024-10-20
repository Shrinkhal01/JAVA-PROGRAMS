import java.util.*;

public class AllPairsShortestPathAlgo {

    final static int INF = 99999; // infinity value
    public void floydWarshall(int[][] graph, int vertices) {
        int[][] dist = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                dist[i][j] = graph[i][j];// copy given input graph into distance matrix
            }
        }
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];//change the distance matrix element if shorter path
                    }
                }
            }
        }
        printSolution(dist, vertices);//printing the shortest distances
    }
    public void printSolution(int[][] dist, int vertices) {
        System.out.println("Shortest distances between every pair of vertices:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();
        int[][] graph = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix (use 99999 for infinity):");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        AllPairsShortestPathAlgo floydWarshallAlgo = new AllPairsShortestPathAlgo();
        floydWarshallAlgo.floydWarshall(graph, vertices);

        scanner.close();
    }
}
