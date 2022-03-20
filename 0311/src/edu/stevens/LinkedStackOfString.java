package edu.stevens;

/**
 * Implement a stack with a single linked list.
 * empty stack: null
 * push 1 into the stack: this-> null
 * push 2 into the stack: is->this->null
 * push 3 into the stack: a->is->this->null
 * pop the stack: is->this->null
 * pop the stack: this->null
 * pop the stack: null
 */

public class LinkedStackOfString {
    private Node first = null;

    private class Node{
        String item;
        Node next;

//        public Node(String item, Node next) {
//            this.item = item;
//            this.next = next;
//        }
//        this.item = null;
//        this.next = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    /**
     * empty stack: null
     *               |-> first
     * push "this" into the stack: this-> null
     *                              |-> first
     * push "is" into the stack: is->this->null
     *                           |-> first
     * push "a" into the stack: a->is->this->null
     *                          |-> first
     */
    public void push(String item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    /**
     * stack: a->is->this->null
     *        |-> first
     * pop the stack: is->this->null
     * pop the stack: this->null
     * pop the stack: null
     */
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    public String toString(){
        Node current = this.first;
        String s = new String();
        while (current != null) {
            s += current.item;
            s += "->";
            current = current.next;
        }
        s += "null";
        return s;
    }

    public static void main(String[] args) {
        LinkedStackOfString s1 = new LinkedStackOfString();
        System.out.println(s1);
        s1.push("this");
        System.out.println(s1);
        s1.push("is");
        s1.push("a");
        s1.push("stack");
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
    }
}
