import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    public Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    private boolean isCyclicUtil(int v, boolean visited[], boolean recStack[]) {
        if (recStack[v]) {
            return true;
        }

        if (visited[v]) {
            return false;
        }

        visited[v] = true;
        recStack[v] = true;

        // Recur for all the vertices adjacent to this vertex
        for (Integer neighbor : adj[v]) {
            if (isCyclicUtil(neighbor, visited, recStack)) {
                return true;
            }
        }

        recStack[v] = false;
        return false;
    }

    public boolean isCyclic() {
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 1); // Adding cycle

        if (g.isCyclic()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}
