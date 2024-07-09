import java.util.*;
class QueueLL{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(23);
        q.add(43);
        q.add(9);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }//printing the queue elements until the queue is empty
    }//at the end the queue is back empty due to remove() function
}