import java.util.*;
public class linkedlist {
    Node head;
    private int size;
    linkedlist(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add- first , last
    public void addF(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            size++;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //add - last
    public void addL(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    public void printl(){
        if( head == null ){
            System.out.println("List is empty");
        }
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+" - > ");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deletef(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
        size--;
    }

    //delete last
    public void deleteL(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node secondL=head;
        Node last=head.next;
        if(last.next!=null){
            last=last.next;
            secondL=secondL.next;
        }
        secondL.next=null;
    }

    public int getsize(){
        return size;
    }



    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addF("MONDAY");
        list.addL("TUESDAY");
        list.addL("WEDNESDAY");
        list.addL("THURSDAY");
        list.addL("FRIDAY");
        list.addL("SATURDAY");
        list.addL("SUNDAY");
        list.printl();      
        list.deleteL();
        System.out.println("The size of the linked list is : "+(list.getsize()));
        list.deleteL();
        list.printl();
    }
}
