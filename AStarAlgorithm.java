import java.util.*;

class Node {
    int x, y;
    int g, h;
    Node parent;

    public Node(int x, int y, int g, int h, Node parent) {
        this.x = x;
        this.y = y;
        this.g = g;
        this.h = h;
        this.parent = parent;
    }

    public int getF() {
        return g + h;
    }
}

public class AStarAlgorithm {
    static final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static List<Node> aStarSearch(int[][] grid, Node start, Node end) {
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingInt(Node::getF));
        Set<String> closedSet = new HashSet<>();
        openList.add(start);

        while (!openList.isEmpty()) {
            Node current = openList.poll();
            closedSet.add(current.x + "," + current.y);

            if (current.x == end.x && current.y == end.y) {
                return buildPath(current);
            }

            for (int[] dir : directions) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];

                if (isInBounds(grid, newX, newY) && grid[newX][newY] == 0 && !closedSet.contains(newX + "," + newY)) {
                    int gCost = current.g + 1;
                    int hCost = Math.abs(newX - end.x) + Math.abs(newY - end.y);
                    Node neighbor = new Node(newX, newY, gCost, hCost, current);

                    openList.add(neighbor);
                }
            }
        }
        return null; // Path not found
    }

    private static boolean isInBounds(int[][] grid, int x, int y) {
        return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length;
    }

    private static List<Node> buildPath(Node end) {
        List<Node> path = new ArrayList<>();
        while (end != null) {
            path.add(0, end);
            end = end.parent;
        }
        return path;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        
        Node start = new Node(0, 0, 0, 0, null);
        Node end = new Node(4, 4, 0, 0, null);
        List<Node> path = aStarSearch(grid, start, end);

        if (path != null) {
            System.out.println("Path found:");
            for (Node node : path) {
                System.out.print("(" + node.x + ", " + node.y + ") ");
            }
        } else {
            System.out.println("No path found.");
        }
    }
}
