import java.util.*;
public class Stack1 {
    static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        static Node head;
        static boolean isEmpty(){
            return head==null;
        }
        static void push(int data){
            Node nn=new Node(data);
            if(isEmpty()){
                head=nn;
                return;
            }
            nn.next=head;
            head=nn;
        }
        static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(98);
        s.push(12);
        s.push(23);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
