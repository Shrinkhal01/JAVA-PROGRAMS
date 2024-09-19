class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }
    private static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val)
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }
    public static void printTree(TreeNode root) {
        printTreeHelper(root, 0);
    }

    private static void printTreeHelper(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        printTreeHelper(node.right, level + 1);
        System.out.println(" ".repeat(level * 4) + node.val);
        printTreeHelper(node.left, level + 1);
    }
    public static void main(String[] args) {
        //enter the tree values
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        if (isSymmetric(root)) {
            System.out.println("The tree is symmetric.");
        } else {
            System.out.println("The tree is not symmetric.");
        }
        printTree(root);
    }
}
