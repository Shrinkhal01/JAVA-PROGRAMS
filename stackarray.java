import java.util.*;
public class stackarray {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public stackarray(int size) {// constructor
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Can't push " + value);
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Popped: " + stackArray[top--]);
        } else {
            System.out.println("Stack is empty. Can't pop");
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        stackarray stack = new stackarray(10);//this is the creation of a new instance of the class 
        stack.push(9);
        stack.push(23);
        stack.push(82);
        stack.push(21);
        stack.push(9);
        stack.push(56);
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}