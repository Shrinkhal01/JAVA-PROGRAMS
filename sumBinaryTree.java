import java.io.*;
class Node
{
    int data;
    Node left, right, nextRight;
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
class sumBinaryTree {
    public static Node root;
    static int sum(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        return (sum(node.left) + node.data+sum(node.right));
    }
    static int isSumTree(Node node)
    {
        int ls,rs;
        if(node == null || (node.left == null && node.right == null))
        {
            return 1;
        }
        ls = sum(node.left);
        rs = sum(node.right);
        if((node.data == ls + rs) && isSumTree(node.left) != 0 && isSumTree(node.right) != 0)
        {
            return 1;
        }
        return 0;
    }
    public static void main (String[] args)
    {
        new sumBinaryTree();
        sumBinaryTree.root = new Node(1);
        sumBinaryTree.root.left = new Node(2);
        sumBinaryTree.root.right = new Node(3);
        sumBinaryTree.root.left.left = new Node(4);
        sumBinaryTree.root.left.right = new Node(5);
        sumBinaryTree.root.right.left = new Node(6);
        sumBinaryTree.root.right.right = new Node(7);
        if(isSumTree(root) != 0)
        {
            System.out.println("The given tree is a SumTree");
        }
        else
        {
            System.out.println("The given tree is not a SumTree");
        }
    }
}
