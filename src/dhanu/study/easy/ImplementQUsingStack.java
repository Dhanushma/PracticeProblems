package dhanu.study.easy;

import java.util.Stack;

public class ImplementQUsingStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public ImplementQUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        int result;
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        result = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }


    public static void main(String[] args) {
        ImplementQUsingStack queue = new ImplementQUsingStack();

       // queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.dequeue());
        queue.enqueue(9);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
