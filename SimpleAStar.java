import java.util.*;

public class SimpleAStar {
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static final int[][] grid = {
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0}
    };
    static class Node implements Comparable<Node> {
        int x, y;
        int g;
        int h; 
        Node parent;
        public Node(int x, int y, int g, int h, Node parent) {
            this.x = x;
            this.y = y;
            this.g = g;
            this.h = h;
            this.parent = parent;
        }
        public int f() {
            return g + h;
        }
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.f(), other.f());
        }
    }
    private static int mhrstic(int x, int y, int goalX, int goalY) {
        return Math.abs(x - goalX) + Math.abs(y - goalY);
    }
    public static List<Node> aStarSearch(int startX, int startY, int goalX, int goalY) {
        PriorityQueue<Node> openList = new PriorityQueue<>();
        Set<String> closedList = new HashSet<>();
        Map<String, Integer> gCostMap = new HashMap<>(); 

        Node startNode = new Node(startX, startY, 0, mhrstic(startX, startY, goalX, goalY), null);//made a startnode that contains start x and y and g and h values

        openList.add(startNode);
        gCostMap.put(startX + "," + startY, 0);
        while (!openList.isEmpty()) {
            Node current = openList.poll();
            if (current.x == goalX && current.y == goalY) {
                List<Node> path = new ArrayList<>();
                while (current != null) {
                    path.add(current);
                    current = current.parent;
                }
                Collections.reverse(path);
                return path;
            }
            closedList.add(current.x + "," + current.y);
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];
                if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || grid[newX][newY] == 1) {
                    continue;
                }
                if (closedList.contains(newX + "," + newY)) {
                    continue;
                }
                int newG = current.g + 1;
                int newH = mhrstic(newX, newY, goalX, goalY);
                Node neighbor = new Node(newX, newY, newG, newH, current);
                if (!gCostMap.containsKey(newX + "," + newY) || newG < gCostMap.get(newX + "," + newY)) {
                    openList.add(neighbor);
                    gCostMap.put(newX + "," + newY, newG);
                }
            }
        }
        return null;
    }
    private static void printGrid(List<Node> path) {
        char[][] displayGrid = new char[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                displayGrid[i][j] = (grid[i][j] == 1) ? '#' : '.';//# denotes walls
            }
        }
        for (Node node : path) {
            displayGrid[node.x][node.y] = 'P';
        }
        for (int i = 0; i < displayGrid.length; i++) {
            for (int j = 0; j < displayGrid[i].length; j++) {
                System.out.print(displayGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int startX = 0, startY = 0; // Starting point
        int goalX = 4, goalY = 5;  // Goal point
        List<Node> path = aStarSearch(startX, startY, goalX, goalY);
        if (path != null) {
            System.out.println("Path found!");
            printGrid(path);
            System.out.println("Path length: " + path.size());
        } else {
            System.out.println("No path found!");
        }
    }
}
