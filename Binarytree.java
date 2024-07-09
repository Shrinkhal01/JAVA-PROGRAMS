import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
class Binarytree{
    Node root;
    public void insert(int data){
        root=insertRec(root,data);
    }

    public Node insertRec(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        else if(data<root.data){
            root.left=insertRec(root.left,data);
        }else if(data>root.data){
            root.right=insertRec(root.right,data);
        }
        return root;
    }

    public void inorder(Node root){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if (root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

}