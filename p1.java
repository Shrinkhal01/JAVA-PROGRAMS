import java.util.*;
public class p1 {
    private int arr[];
    private int start,end,curS,maxSize;
    public p1(){
        arr=new int[16];
        start=-1;
        end=-1;
        curS=0;
    }

    void push(int a){
        if(curS==maxSize){
            System.out.println("The queue is full");
            System.exit(1);
        }
        if(end==-1){
            start=0;
            end=0;
        }else{
            end=(end+1)%maxSize;
        }
        arr[end]=a;
        System.out.println("The pushed element is "+a);
        curS++;
    }

    int pop(){
        if(start==-1){//if queue is empty
            System.out.println("The queue is empty 🥲🥲");
            return 0;
        }
        int popd=arr[start];//the start positioned element we already have 😎
        if(curS==1){//is the queue containing only one element
            start=-1;
            end=-1;
        }
        else{//else simply make it such that we return the start positioned element that we already have
            start=(start+1)%maxSize;
        }
        return popd;
    }

    int size(){
        return curS;
    }

    int top(){
        if(start==-1){
            System.out.println("The queue is empty");
            System.exit(1);
        }
        return arr[start];
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(5);
        q.add(43);
        q.add(23);
        q.add(4);
        q.add(14);
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.poll());
        System.out.println("The peek of the queue after deleting an element " + q.peek());
        System.out.println("The size of the queue after deleting an element " + q.size());
        System.out.println("The entire queue and we are removing them after printing the so actually here we are popping them all");
        while(q.peek()!=null){
            System.out.println(q.poll());
        }
        if(q.peek()==null){
            System.out.println("The queue is now empty ");
        }
    }
}
