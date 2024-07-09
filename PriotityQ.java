import java.util.*;
public class PriotityQ {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.offer(32);
        q.offer(98);
        q.offer(2);
        q.offer(0);
        q.offer(32);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}
