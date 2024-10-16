public class RedBlackTree<T extends Comparable<T>> {
    private Node<T> root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node<T> {
        T key;
        Node<T> left, right;
        boolean color;

        public Node(T key, boolean color) {
            this.key = key;
            this.color = color;
        }
    }

    public RedBlackTree() {
        root = null;
    }

    public void insert(T key) {
        root = insert(root, key);
        root.color = BLACK;  // Ensure root remains black
    }

    private Node<T> insert(Node<T> node, T key) {
        if (node == null) return new Node<>(key, RED);

        int cmp = key.compareTo(node.key);
        if (cmp < 0) node.left = insert(node.left, key);
        else if (cmp > 0) node.right = insert(node.right, key);

        // Balance the tree
        if (isRed(node.right) && !isRed(node.left)) node = rotateLeft(node);
        if (isRed(node.left) && isRed(node.left.left)) node = rotateRight(node);
        if (isRed(node.left) && isRed(node.right)) flipColors(node);

        return node;
    }

    private boolean isRed(Node<T> node) {
        return node != null && node.color == RED;
    }

    private Node<T> rotateLeft(Node<T> node) {
        Node<T> x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    private Node<T> rotateRight(Node<T> node) {
        Node<T> x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    private void flipColors(Node<T> node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    // In-order traversal to print the tree
    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node<T> node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.key + " ");
            printInOrder(node.right);
        }
    }

    // Search function to check if a key exists
    public boolean contains(T key) {
        return contains(root, key);
    }

    private boolean contains(Node<T> node, T key) {
        if (node == null) return false;
        int cmp = key.compareTo(node.key);
        if (cmp < 0) return contains(node.left, key);
        else if (cmp > 0) return contains(node.right, key);
        else return true;
    }

    // Main function to demonstrate usage
    public static void main(String[] args) {
        RedBlackTree<Integer> rbt = new RedBlackTree<>();

        // Insert sample values
        rbt.insert(10);
        rbt.insert(20);
        rbt.insert(15);
        rbt.insert(30);
        rbt.insert(25);

        // Print the tree in order
        System.out.println("In-order traversal of Red-Black Tree:");
        rbt.printInOrder();

        // Search for specific keys
        System.out.println("Does the tree contain 15? " + rbt.contains(15));
        System.out.println("Does the tree contain 5? " + rbt.contains(5));
    }
}
