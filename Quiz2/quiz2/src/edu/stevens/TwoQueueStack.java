package edu.stevens;

import java.util.Queue;
import java.util.LinkedList;

public class TwoQueueStack {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        // Push x first in empty q2
        q2.add(x);
        // Push all the elements in q1 to q2
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        //swap two queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        TwoQueueStack s = new TwoQueueStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
