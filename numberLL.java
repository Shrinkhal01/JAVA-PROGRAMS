import java.util.*;
public class numberLL {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }   
    }


    public void inputN(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
            return;
        }
    }

    public void sum(){
        Node nn=head;
        int sum=0;
        while(nn!=null){
            sum=sum*10+nn.data;
            nn=nn.next;
        }
        System.out.println("The sum of the nodes data is : "+sum);
        return;
    }

    public static void printl(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        return;
    }

    public static void main(String[] args) {
        numberLL n=new numberLL();
        n.inputN(5);
        n.inputN(1);
        n.inputN(3);
        n.inputN(2);
        n.inputN(9);
        n.inputN(2);
        numberLL.printl();
        n.sum();

    }
}
