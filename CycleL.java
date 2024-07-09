import java.util.*;
public class CycleL {
    static Node head;
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public static void addF(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
        }
        curNode.next=newnode;
        //hence the node with the given data is added at the end of the linked list
        //here i have taken the assumption that we only add at the end of the linked list
        //only to mantain the simplicity of the program
    }

    public static boolean ifcycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
    
        Node slow = head;
        Node fast = head.next;
    
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return false; // No cycle detected
    }
    
    public static void printl() {
        Node header = head;
        while (header != null) {
            System.out.print(header.data + " -> ");
            header = header.next;
        }
    }
    

    public static void main(String[] args) {
        CycleL ll = new CycleL();
        CycleL.addF("40");
        CycleL.addF("41");
        CycleL.addF("42");
        CycleL.addF("43");
        CycleL.addF("44");
        CycleL.addF("45");
        CycleL.addF("46");
        CycleL.addF("47");
        CycleL.addF("48");
        CycleL.addF("49");
        CycleL.addF("40");
    
        // Check for cycles in the linked list
        if (CycleL.ifcycle(CycleL.head)) {
            System.out.println("There is a cycle");
        } else {
            System.out.println("There is no cycle");
        }
    }
    
}
