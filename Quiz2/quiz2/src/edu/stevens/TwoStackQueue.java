package edu.stevens;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        // While stack1 is not empty,
        // push everything from stack1 to stack2.
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Push x to stack1
        s1.push(x);
        // Push everything back to stack1.
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int dequeue() {
        return s1.pop();
    }

    public boolean empty() {
        return (s1.isEmpty());
    }

    public static void main(String[] args) {
        TwoStackQueue q = new TwoStackQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

}
