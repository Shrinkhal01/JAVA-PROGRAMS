import java.util.ArrayDeque;
import java.util.Deque;

import java.util..*;;
public class simpleque {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.add(0);
        d.add(3);
        d.add(32);
        d.add(54);

        d.addLast(42);
        d.removeLast();
    }
}
