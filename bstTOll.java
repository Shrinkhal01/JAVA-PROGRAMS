import java.util.*;

class bstTOll {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    public static void main(String[] args) {
        bstTOll tree = new bstTOll();
        tree.root = tree.new Node(10);
        tree.root.left = tree.new Node(5);
        tree.root.right = tree.new Node(20);
        tree.root.left.left = tree.new Node(3);
        tree.root.left.right = tree.new Node(7);
        tree.root.right.left = tree.new Node(15);
        tree.root.right.right = tree.new Node(25);
        System.out.println("Initial Binary Tree:");
        tree.printTree(tree.root, 0);
        tree.btl(tree.root); // apply using the object we created
        bstTOll.printflattenedtree(tree.root); // function used using the class name
    }

    private Node prev = null;

    void printTree(Node node, int level) {
        if (node == null) {
            return;
        }
        printTree(node.left, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(node.data);
        printTree(node.right, level + 1);
    }

    void btl(Node node) {
        if (node == null) return;
        btl(node.right);
        btl(node.left);
        node.right = prev;
        node.left = null;
        prev = node;
    }

    public static void printflattenedtree(Node root) {
        while (root != null) {
            System.out.print(root.data + " -> ");
            root = root.right;
        }
        System.out.print("null");
        System.out.println();
    }
}
