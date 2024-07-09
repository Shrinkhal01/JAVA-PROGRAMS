import java.util.*;

class treesum {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root; 

    public void insert(int d) {
        if (root == null) {
            root = new Node(d);
        } else if (d < root.data) {
            root.left.data = d;
        }
    }
}