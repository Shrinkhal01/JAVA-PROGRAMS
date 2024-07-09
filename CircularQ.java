import java.util.*;

public class CircularQ {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQ(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.queue = new int[capacity];
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int e) {
        if (isFull()) {
            System.out.println("Full Queue!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = e;// Assign the new element to the rear position
        size++;
        if (front == -1) {
            front = 0;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return -1;
        }
        int item = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {
        CircularQ q = new CircularQ(5);
        q.enqueue(89);
        q.enqueue(99);
        q.enqueue(23);
        q.enqueue(12);
        q.enqueue(23);
        q.enqueue(34);// This element will not be enqueued as the queue is full
        q.printQueue();// Initial queue
        q.dequeue();
        q.printQueue();// After dequeue operation
        q.dequeue();
        q.printQueue();// After second dequeue operation
    }
}