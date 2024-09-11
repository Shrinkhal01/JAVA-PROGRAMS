import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    
    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}//similar to the struct in C language

public class CousinsNodes {
    
    // Helper function to check if two nodes are cousins
    public boolean areCousins(TreeNode root, int x, int y) {
        // Both nodes same parent = >  not cousins
        if (root == null || root.val == x || root.val == y) {
            return false;
        }

        return (level(root, x, 1) == level(root, y, 1)) && (!isSibling(root, x, y));
    }

    // Function to find the level of a given node
    private int level(TreeNode root, int val, int depth) {
        if (root == null) return 0;
        if (root.val == val) return depth;

        int left = level(root.left, val, depth + 1);
        if (left != 0) return left;

        return level(root.right, val, depth + 1);
    }

    // Function to check if two nodes have the same parent
    private boolean isSibling(TreeNode root, int x, int y) {
        if (root == null) return false;

        boolean leftRightCheck = (root.left != null && root.right != null) && 
                                 ((root.left.val == x && root.right.val == y) ||
                                  (root.left.val == y && root.right.val == x));

        return leftRightCheck || isSibling(root.left, x, y) || isSibling(root.right, x, y);
    }

    public static void main(String[] args) {
        CousinsNodes tree = new CousinsNodes();
        TreeNode root = new TreeNode(1);// Creating a binary tree
        //enter the values of the nodes
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(tree.areCousins(root, 4, 6)); 
        System.out.println(tree.areCousins(root, 4, 5)); 
    }
}
