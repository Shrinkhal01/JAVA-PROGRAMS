import java.util.*;
class remdup{
    Node head;
    Node nn;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public void addN(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
    }

    public void removedup() {
        Node temp = head;
        while (temp != null) {
            Node nn = temp;
            while (nn != null && nn.next != null) {
                if (nn.next.val == temp.val) {
                    nn.next = nn.next.next;
                } else {
                    nn = nn.next;
                }
            }
            temp = temp.next;
        }
    }

    public void printL(){
        Node ne=head;
        while(ne.next!=null){
            System.out.print(ne.val+" - > ");
            ne=ne.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        remdup list=new remdup();
        list.addN(12);
        list.addN(12);
        list.addN(15);
        list.addN(18);
        list.addN(21);
        list.addN(24);
        list.addN(23);
        list.addN(15);
        list.addN(23);
        list.addN(54);
        list.addN(27);
        list.printL();
        list.removedup();
        System.out.println();
        list.printL();
    }
}