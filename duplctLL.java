import java.util.*;
public class duplctLL {
    static Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void duprm(Node head){
        Node n=new Node();
        n=head;
        Node temp=n.next;
        while(n!=null){
            int p=n.data;
            if(temp.data==p){
                delete(temp);
            }else{
                temp=temp.next;
            }
            n=n.next;
        }
        return;
    }
    public void delete(Node nodetodel){
        if(nodetodel==null||head==null){
            return;
        }
        else if(nodetodel==head){
            head=nodetodel.next;
            return;
        }
        Node previous=head;
        while(previous.next!=nodetodel){
            previous=previous.next;
        }
        if(previous.next==nodetodel){
            previous.next=previous.next.next;
            return;
        }
        if(previous.next==null){
            return;
        }
    }
    public static void main(String[] args) {
        duplctLL linkedList = new duplctLL();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(2);
        linkedList.addNode(4);
        linkedList.addNode(1);

        linkedList.duprm();
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
