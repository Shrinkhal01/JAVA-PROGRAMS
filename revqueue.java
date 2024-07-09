import java.util.*;
class revqueue{
    //Queue is an interface thus we write LinkedList
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(90);
        q.add(23);
        q.add(43);
        q.add(9);
        q.add(4);
        //before that lets print the que
        System.out.println("Initially the queue is as :");
        for(Integer e : q){
            System.out.println(e);
        }
        //now begins the reversing of the que 
        revq(q);
        System.out.println("After reversing the queue we get to see the queue as");
        while(!(q.isEmpty())){
            System.out.println(q.poll());//""""the poll function in java gives the head and removes it""""""
        }
    }

    public static void revq(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int e=q.peek();
        q.remove();
        revq(q);
        q.add(e);
    }
}