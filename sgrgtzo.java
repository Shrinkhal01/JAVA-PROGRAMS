import java.util.*;
class sgrgtzo{
    private int front;
    private int rear;
    private int capacity;

    public sgrgtzo(int n){
        this.capacity=n;
        this.front=-1;
        this.rear=-1;
    }

    public segreagat(int e){
        if(isEmpty()){
            System.out.println("Empty Queue!");
        }
        
    }

    public enque(int n){
        if(isEmpty()){
            System.out.println("Empty Queue!");
        }
        front = (front +1)%capacity;
        q[front]=n;
        front++;
    }
    public int dequeue(){
        if(isFull()){
            System.out.println("Full queue");
        }
        int item=q[front];
        rear=(rear+1)%capacity;
        size--;
        return item;
    }

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayList();
        q.add(0);
        q.add(1);
        q.add(1);  
        q.add(0);
        q.add(1);      
        q.add(1);
        q.add(1);
        q.add(0);
        q.add(1);
        q.add(1);
        q.add(0);
        q.add(1);
        q.add(1);
        q.add(1);
        q.add(0);
        q.add(1);
        q.add(0);
        q.add(1);
        q.add(1);
        q.add(1);
        for(Integer i:q){
            System.out.println(q);
        }

    }

}