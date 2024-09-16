import java.util.*;
public class mergeK {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of linked lists: ");
        int k = scanner.nextInt();
        ListNode[] lists = new ListNode[k];
        for (int i = 0; i < k; i++) {
            System.out.print("Enter the number of nodes for list " + (i + 1) + ": ");
            int n = scanner.nextInt();
            ListNode head = null;
            ListNode curr = null;
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the value for node " + (j + 1) + ": ");
                int val = scanner.nextInt();
                ListNode node = new ListNode(val);
                if (head == null) {
                    head = node;
                    curr = node;
                } else {
                    curr.next = node;
                    curr = curr.next;
                }
            }
            lists[i] = head;
        }
        scanner.close();
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }
        ListNode mergedList = dummy.next;
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
