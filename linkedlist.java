import java.util.*;
public class linkedlist {
    static Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;//
            this.next=null;
        }
    }

    //add- first , last
    public void addF(String data){
        Node newnode=new Node(data);
        if(head==null){ 
            head=newnode;
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
            return;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newNode;
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

    public Node reverseI(Node head){

        if(head==null||head.next==null){
            return head;
        }
        Node newhead=reverseI(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;

    }

    


    public static int length(Node a){
        int i=0;
        while(a!=null){
            i++;
            a=a.next;
        }
        return i;
    }

    public static void intersect(Node a, Node b) {
        List<Integer> intersectingValues = new ArrayList<>();//new thing learnt
    
        while (a != null && b != null) {
            if (a.data==b.data) {
                intersectingValues.add(Integer.parseInt(a.data));
            }
            a = a.next;
            b = b.next;
        }
    
        if (intersectingValues.isEmpty()||intersectingValues==null) {
            System.out.println("They don't intersect at any point in their entirety");
        } else {
            System.out.println("They intersect at the following nodes:");
            for (Integer value : intersectingValues) {
                System.out.println(value);
            }
        }
    }
    

    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.addL("1");
        list.addL("2");
        list.addL("3");
        list.addL("34");
        list.addL("45");
        list.printl(); 
        linkedlist list22=new linkedlist();
        list22.addL("31");
        list22.addL("2");
        list22.addL("10");
        list22.addL("65");
        list22.addL("45");
        list22.printl();
        
        intersect(list.head,list22.head);
    }
}
