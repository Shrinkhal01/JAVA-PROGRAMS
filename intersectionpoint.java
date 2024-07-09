import java.util.*;
public class Intersectionpoint {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        Node p = headA;
        Node q = headB;

        // Check if either list is empty
        if (p == null || q == null) {
            return null;
        }

        // Traverse both lists to find their lengths
        int lenA = getLength(p);
        int lenB = getLength(q);

        // Move the longer list's pointer ahead by the difference in lengths
        if (lenA > lenB) {
            p = moveAhead(p, lenA - lenB);
        } else {
            q = moveAhead(q, lenB - lenA);
        }

        // Traverse both lists simultaneously until the pointers meet or reach the end
        while (p != null && q != null) {
            if (p == q) {
                return p; // Intersection found
            }
            p = p.next;
            q = q.next;
        }

        return null; // No intersection
    }

    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private Node moveAhead(Node head, int k) {
        while (k > 0) {
            head = head.next;
            k--;
        }
        return head;
    }

    public static void main(String[] args) {
        Intersectionpoint list1 = new Intersectionpoint();
        list1.insert(45);
        list1.insert(90);
        list1.insert(12);
        list1.insert(2123);
        list1.insert(281);
        list1.insert(0);

        Intersectionpoint list2 = new Intersectionpoint();
        list2.insert(12);
        list2.insert(23);
        list2.insert(21);
        list2.insert(291);
        list2.insert(281);
        list2.insert(2112);

        // Create the intersection point
        Node intersectionNode = new Node(1000);
        list1.head.next.next.next = intersectionNode;
        list2.head.next.next.next.next.next = intersectionNode;

        Node intersection = list1.getIntersectionNode(list1.head, list2.head);
        if (intersection != null) {
            System.out.println("Intersection point: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}