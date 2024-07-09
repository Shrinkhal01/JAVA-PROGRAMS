import java.util.*;
public class simpleq {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();//que is an interface we use the linkedlist

        q.add(32);
        q.add(54);
        q.add(90);
        q.add(53);
        System.out.println("The queue is "+q);
        q.remove();
        System.out.println("The queue after using the remove function is "+q);
        System.out.println("The que using the peek function is :"+q.peek());//gets the item but does not remove the item
        System.out.println("The que using the peek function is :"+q.peek());
    }
}
