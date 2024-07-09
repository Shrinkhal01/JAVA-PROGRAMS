package treehelp;

public class treehelper {

    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }//this method is to insert the data in the tree

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }//this method is to insert the data in the tree in order of the data

    public void inorder() {
        inorderRec(root);
    }//this method will call the inorderRec method to print the tree in inorder

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }//this method is to print the children of the root in order of left, root, right

    public void preorder() {
        preorderRec(root);
    }//this method is to print the children of the root in order of left, root, right

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }//this method is to print the children of the root in order of left, right, root
    public void postorder() {
        postorderRec(root);
    }//this method is to print the children of the root in order of left, right, root

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }//this method is to print the order of the children of the root in order of left, right, root
}