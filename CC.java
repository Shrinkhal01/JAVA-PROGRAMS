import java.util.*;
class CC{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void inputN(int d){
        Node nn= new Node(d);
        if(head==null){
            head=nn;
            nn.next=nn;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=nn;
            nn.next=head;
            return;
        }
    }


    public void printl(){
        Node temp = head;
        if (temp!= null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while(temp != head);
        }
    }
    
    public int clength(){
        Node temp = head;
        int c = 0;
        if (temp != null) {
            do {
                c++;
                temp = temp.next;
            } while(temp != head);
        }
        return c;
    }

    public void cdiv(){
        Node fast=head;
        Node slow=head;
        //VERY IMPORTANT
        //the following loop helps in dividing the list into 2 linked list of equal or into the one where the firstone is +1 longer
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node h1=head;
        Node h2=slow.next;
        slow.next=h1;//making the list 1 circular
        if(fast.next==head){
            fast.next=h2;
        }else{
            fast.next.next=h2;
        }
        //comments added by me since this one  took time to understand 😬 
        //it really took time 🥲
        CC fhalf=new CC(); // Create new instance for first half
        CC shalf=new CC(); // Create new instance for second half
        fhalf.head = h1; // Assign h1 to fhalf.head
        shalf.head = h2; // Assign h2 to shalf.head
        System.out.println("First Half:");
        fhalf.printl(); // Print first half
        System.out.println("\nSecond Half:");
        shalf.printl(); // Print second half

    }

    public static void main(String[] args) {
        CC n=new CC();
        n.inputN(5);
        n.inputN(6);
        n.inputN(3);
        n.inputN(1);
        n.inputN(8);
        n.inputN(7);
        n.printl();
        System.out.println();
        n.cdiv();//prints the lls' the original one gets divided into
    }

}