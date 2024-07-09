package treehelp;

public class Main {
    public static void main(String[] args) {
        treehelper tree = new treehelper();
        tree.insert(2);
        tree.insert(9);
        tree.insert(0);
        tree.insert(10);
        tree.insert(21);
        tree.insert(43);
        tree.inorder();
    }
}