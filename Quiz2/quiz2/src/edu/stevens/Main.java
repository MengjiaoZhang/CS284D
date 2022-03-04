package edu.stevens;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
//        System.out.println(q1.peek());
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);

        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

    }
}
