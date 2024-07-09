import java.util.*;
public class LINKEDLIST {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addF(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addL(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        while(head.next!=null){
            head=head.next;
        }
        head.next=newnode;
    }

    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    

    public void printl(){
        Node curNode=head;
        if(head==null){
            System.out.println("List is empty");
        }
        while(curNode!=null){
            System.out.print(curNode.data+" - > ");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LINKEDLIST list=new LINKEDLIST();
        list.addL("1");
        list.addL("2");
        list.addL("3");
        list.printl(); 
        list.head=list.reverse(list.head);
        list.printl();
    }
}