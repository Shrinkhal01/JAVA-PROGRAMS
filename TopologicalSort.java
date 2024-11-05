import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices and edges: ");
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) adjList.add(new ArrayList<>());
        int[] indegree = new int[vertices];
        System.out.println("Enter edges (from -> to): ");
        for (int i = 0; i < edges; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjList.get(from).add(to);
            indegree[to]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) if (indegree[i] == 0) queue.add(i);
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            order.add(vertex);
            for (int neighbor : adjList.get(vertex)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) queue.add(neighbor);
            }
        }
        if (order.size() == vertices) {
            System.out.println("Topological Order: " + order);
        } else {
            System.out.println("Cycle detected; topological sort not possible.");
        }
        sc.close();
    }
}
