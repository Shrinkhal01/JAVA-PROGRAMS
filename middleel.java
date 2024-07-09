import java.util.*;
public class middleel {
    static Node head;
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    static void insert(String data){
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
    static int count(){
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
    public static void main(String[] args) {
        middleel.insert("56");
        middleel.insert("54");
        middleel.insert("87");
        middleel.insert("12");
        middleel.insert("56");
        middleel.insert("342");
        middleel.insert("09");
        middleel.insert("123");
        middleel.insert("154");
        middleel.insert("554");
        middleel.insert("560");
        int len=middleel.count();
        System.out.println("the length of the linkedlist is : "+len);
        int mid=len/2;
        Node prnt=head;
        for(int i=0;i<mid;i++){
            prnt=prnt.next;
        }
        System.out.println("The node at the mid of the linked list is : "+prnt.data);
    }
}
