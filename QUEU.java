import java.util.*;
public class QUEU {
    int size=5;
    int items[]=new int[size];
    int front, rear;

    QUEU(){
        front =-1;
        rear = -1;
    }
    boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }

    boolean isEmpt(){
        if(front ==-1){
            return true;
        }
        return false;
    }

    void enQ(int element){
        if(isFull()){
            System.out.println("Queu is full");
        }else{
            if(front==-1)
                front=0;
            rear++;
            items[rear]=element;
            System.out.println("Inserted "+element);
        }
    }

    int deQ(){
        int element;
        if(isEmpt()){
            System.out.println("The queu is empty");
            return (-1);
        }
        else{
            element=items[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
            System.out.println("Deleted - > "+element);
            return element;
        }
    }
    void display(){
          int i;
          if(isEmpt()){
            System.out.println("Empty Queue");
          }  
          else{
            System.out.println("\nFront index -> "+front);
            System.out.println("Item -> ");
            for(i=front;i<rear;i++){
                System.out.println(items[i]+" ");
            }
            System.out.println("\nRear index -> "+rear);
          }
    }

    public static void main(String[] args) {
        QUEU q = new QUEU();
        q.display();
        q.deQ();

        q.enQ(1);
        q.enQ(2);
        q.enQ(3);
        q.enQ(4);
        q.enQ(5);

        q.enQ(6);

        q.display();

        q.deQ();
        q.display();
    }
}
