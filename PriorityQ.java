import java.util.*;
public class PriorityQ {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();//since i used the priority queue here it already gets arranged in the ascending order 
        q.offer(3);//inputting the elements into the queue
        q.offer(98);
        q.offer(2);
        q.offer(0);
        q.offer(32);

        while(!q.isEmpty()){
            System.out.println(q.poll());//printing the elements of queue rather popping 
        }//since the elements get removed from the queue after the printing of element

    }
}
