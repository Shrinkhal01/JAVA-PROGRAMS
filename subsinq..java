import java.util.*;

class subsinq {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        // Add elements to q2
        System.out.println("Enter 10 elements into the queue:");
        for (int i = 1; i <= 10; i++) {
            int element = s.nextInt();
            q2.add(element); // inbuilt add function to add elements to the queue
        }

        // Moving of elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll()); // the poll function gets the head and just removes it from the initial place in
                               // this case
        }

        // Swapping q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        // Removing the top of q1
        int top = q1.poll();
        System.out.println("Top element: " + top);
    }
}
