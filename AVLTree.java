import java.util.Scanner;
class Node {
    int key, height;
    Node left, right;
    Node(int d) {
        key = d;
        height = 1;
    }
}
class AVLTree {
    Node root;
    // Get the height of the node
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }
    // Get maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
    // Right rotate subtree rooted with y
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        // Perform rotation
        x.right = y;
        y.left = T2;
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        // Return new root
        return x;
    }
    // Left rotate subtree rooted with x
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }
    // Get the balance factor of node N
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }
    // Insert a node in the AVL tree
    Node insert(Node node, int key) {
        // Perform the normal BST insertion
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys are not allowed in AVL tree
            return node;

        // Update height of this ancestor node
        node.height = 1 + max(height(node.left), height(node.right));

        // Get the balance factor of this ancestor node
        int balance = getBalance(node);
        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    // Find the node with the minimum value
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }
    // Delete a node from the AVL tree
    Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            // Node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
                if (temp == null) { // No child case
                    temp = root;
                    root = null;
                } else // One child case
                    root = temp;
            } else {
                // Node with two children
                Node temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }
        if (root == null)
            return root;
        // Update height of the current node
        root.height = max(height(root.left), height(root.right)) + 1;
        // Get the balance factor
        int balance = getBalance(root);
        // Balance the node
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    // In-order traversal
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }
    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AVLTree tree = new AVLTree();
        while (true) {
            System.out.println("\nAVL Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display In-order");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a value to insert: ");
                    int insertValue = scanner.nextInt();
                    tree.root = tree.insert(tree.root, insertValue);
                    break;
                case 2:
                    System.out.print("Enter a value to delete: ");
                    int deleteValue = scanner.nextInt();
                    tree.root = tree.deleteNode(tree.root, deleteValue);
                    break;
                case 3:
                    System.out.println("In-order traversal of the AVL tree:");
                    tree.inOrder(tree.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
    }
}
