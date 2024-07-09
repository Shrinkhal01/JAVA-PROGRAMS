import java.util.*;
public class palindromeLL {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void input(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp=nn;
        return;
    }


    public Node copyL(Node head){
        if(head==null) return null;
        Node nn=new Node(node.data);
        nn.next=copyL(nn.next);
        return  nn;
    }

    public void palindrome(){
        Node temp=head;

    }

}