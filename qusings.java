import java.util.*;

public class qusings {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int z) {
        s1.push(z);
    }

    public int dequeue() {
        if (!s2.empty()) {
            return s2.pop();
        }
        if (s1.empty()) {
            return -1;
        }
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }
}
