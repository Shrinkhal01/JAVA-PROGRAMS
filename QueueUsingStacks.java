import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {//constructor which creates two empty stacks when called
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {//adds an element to the que
        stack1.push(x);
    }

    public int pop() {//pehle sb ko transfer kia fir que k liye doosre stack k top ko pop 😉
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {//same thing as pop just no deletion only printing
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {//if both stacks empty => queue is empty
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop()); 
        System.out.println(queue.pop()); 
        System.out.println(queue.pop()); 

        System.out.println(queue.empty()); 
    }
}