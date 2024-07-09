import java.util.*;

public class mergell {
    static Node head;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(String data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
    }

    public int count() {
        int n = 0;
        Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        return n;
    }

    public Node mergesort() {
        return mergesort(head);
    }

    private Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;

        middle.next = null;
        Node left = mergesort(head);
        Node right = mergesort(nextToMiddle);

        return merge(left, right);
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;//fast and slow one thing is common read it online so adapted it
        }

        return slow;
    }

    private Node merge(Node left, Node right) {
        Node result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.data.compareTo(right.data) <= 0) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    public void bsort() {
    int c = count();
    System.out.println("Total nodes are : " + c);

    for (int i = 0; i < c - 1; i++) {
        Node prev = null;
        Node curr = head;
        for (int j = 0; j < c - i - 1; j++) {
            if (curr.next != null && (curr.data).compareTo(curr.next.data) > 0) {
                if (prev == null) {
                    Node temp = curr.next;
                    curr.next = temp.next;
                    temp.next = curr;
                    head = temp;
                    prev = temp;
                } else {
                    Node temp = curr.next;
                    curr.next = temp.next;
                    temp.next = curr;
                    prev.next = temp;
                    prev = temp;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    System.out.println("The sorted list is : ");
    Node temp2 = head;
    while (temp2 != null) {
        System.out.print(temp2.data + " ");
        temp2 = temp2.next;
    }
    System.out.println();
}

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mergell firstList = new mergell();
        firstList.insert("56");
        firstList.insert("54");
        firstList.insert("87");
        firstList.insert("12");
        firstList.insert("56");
        firstList.insert("342");
        firstList.insert("09");
        firstList.insert("123");
        firstList.insert("154");
        firstList.insert("554");
        firstList.insert("560");
        System.out.println("First list unsorted:");
        firstList.printList();

        head = firstList.mergesort();

        System.out.println("First list sorted:");
        firstList.printList();

        mergell secondList = new mergell();
        secondList.insert("10");
        secondList.insert("20");
        secondList.insert("30");
        secondList.insert("40");
        secondList.insert("50");
        System.out.println("Second list unsorted:");
        secondList.printList();

        head = secondList.mergesort();

        System.out.println("Second list sorted:");
        secondList.printList();
    }
}