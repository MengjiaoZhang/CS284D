package edu.stevens;

import java.util.ArrayList;

public class IDLList <E> {

//    inner class Node<E>
    private class Node <E> {
//        data fields
        private E data;
        private Node<E> next;
        private Node<E> prev;

//        constructor1
        /**
         * This constructor creates a node holding elem
         * The next and prev pointing to null
         *         prev|elem|next
         *         null|elem|null
         * @param elem : data to be stored in the Node
         */
        public Node (E elem){
                this.data = elem;
                this.next = null;
                this.prev = null;
        }

//        constructor2
        /**
         * This constructor creates a node holding elem
         * Next pointing to the next param and prev pointing to the prev param
         * prev node <- prev|elem|next -> next node
         * @param elem
         * @param prev
         * @param next
         */
        public Node (E elem, Node<E> prev, Node<E> next){
            this.data = elem;
            this.prev = prev;
            this.next = next;
        }
    }

//    data fields
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private ArrayList<Node<E>> indices;

//    Constructor for IDLList
    /**
     * This constructor creates an empty IDLList
     * Head and tail are set to null and size is set to zero.
     * assign an empty ArrayList to indices and what will be stored in ArrayList are nodes' references
     */
    public IDLList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.indices = new ArrayList<>();
    }

//    methods

    /**
     * This method add elem at the head. (it becomes the first element of the list)
     * @param elem the elem to be placed to be placed at the head.
     * @return always return ture
     */
    public boolean add(E elem) {
        if (this.head == null) {
            // if the list is empty
            // create a new node
            // both head and tail will point to this node
            Node<E> newFirst = new Node<>(elem);
            this.head = newFirst;
            this.tail = newFirst;
            this.indices.add(0, newFirst);
        } else {
            // the list is not empty
            // get the reference of the first node. (oldfirst)
            // create a new node:
            //     the head point to this new node (newfirst)
            //     the next of this new node point to the old first node
            //     the prev of the oldfirst node point to the new node.
            Node<E> oldFirst = this.indices.get(0);
            Node<E> newFirst = new Node<E>(elem, null, oldFirst);
            oldFirst.prev = newFirst;
            this.head = newFirst;
            this.indices.add(0, newFirst);
        }
        this.size++;
        return true;
    }

    /**
     * This method add elem at position index and use the index for fast access
     * @param index the position in which the elem to be placed in the IDLL
     * @param elem the elem to be placed
     * @return always return true
     */
    public boolean add(int index, E elem){
        if( index < 0 || index > this.size) {
           throw new IndexOutOfBoundsException();
        } else if(index == 0) {
            // use the add(E elem) to add elem at head
            this.add(elem);
        } else if (index == this.size) {
            append(elem);
        }
        else {
            // get the current node at the input index and the prev node of current node
            // create a new node: prev -> prev node of current node
            //                    next -> current node
            // for the prev node of current node: the next of it is the new node
            // for the current node: the prev is the new node
            Node<E> current = this.indices.get(index);
            Node<E> currentPrev = this.indices.get(index-1);
            Node<E> newNode = new Node<E>(elem, currentPrev, current);
            currentPrev.next = newNode;
            current.prev = newNode;
            // update the size of the IDLList and the indices
            this.size++;
            this.indices.add(index, newNode);
        }
        return true;
    }

    /**
     * This method adds elem as the new last element of the list (i.e. at the tail).
     * @param elem the elem to be placed at the tail
     * @return always return true
     */
    public boolean append (E elem) {
        // if the list is empty -> call add(elem)
        if (this.size == 0) {
            this.add(elem);
        } else {
            // get the old last node (which is also the tail)
            // create a new node: prev -> last node
            //                    next -> last node's next (null)
            // for the old last node: the next of it is the new node
            // now the last node is the new node
            Node<E> oldLast = this.tail;
            Node<E> newLast = new Node<E>(elem, oldLast, null);
            oldLast.next = newLast;
            this.tail = newLast;
            // update the indices and the size of the IDLList
            this.size++;
            this.indices.add(newLast);
        }
        return true;
    }

    /**
     * This method returns the object at position index from the head. It uses the index for fast access
     * The return type is E, which is the element type.
     * @param index the index of the node
     * @return the data value of that node
     */
    public E get(int index) {
        // if the index is invaild
        if (index <0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        } else {
            // return the data of the node at the input index
            return this.indices.get(index).data;
        }
    }

    /**
     * This method returns the object at the head.
     * The return type is E, which is the element type.
     * @return the data value at the head
     */
    public E getHead() {
        // if the list is empty
        if (this.size == 0) {
            throw new IllegalArgumentException();
        }
        return this.head.data;
    }

    /**
     * This method returns the object at the tail.
     * The return type is E, which is the element type.
     * @return the data value at the tail
     */
    public E getLast() {
        // if the list is empty
        if (this.size == 0) {
            throw new IllegalArgumentException();
        }
        return this.tail.data;
    }

    /**
     * this method returns the list size.
     * @return the size of the list
     */
    public int size() {
        return this.size;
    }

    /**
     * removes and returns the element at the head.
     * Should throw an IllegalStateException if there is no such element.
     * @return the data value of the head being removed
     */
    public E remove() {
        // if there is no head (head is null)
        if (this.head == null) {
            throw new IllegalStateException();
        }
        // if this list only has 1 node
        if (this.size == 1) {
            E temp = this.head.data;
            this.head = null;
            this.tail = null;
            this.indices.remove(0);
            this.size--;
            return temp;
        }

        // get the oldhead of the list
        // if we remove the oldhead:
        //       the new head will be oldhead.next
        //       the prev of the new head will be null
        Node<E> oldHead = this.head;
        this.head = oldHead.next;
        this.head.prev = null;
        this.indices.remove(0);
        this.size--;
        return oldHead.data;
    }

    /**
     * This method removes and returns the element at the tail.
     * Should throw an IllegalStateException if there is no such element.
     * @return the data value of the tail being removed
     */
    public E removeLast() {
        // if the list is empty
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        // if only 1 node in the list, call remove()
        if (this.size == 1) {
            return remove();
        }
        // get the oldTail of the list
        // if we remove the oldtail:
        //       the new tail will be oldtail.prev
        //       the next of the new tail will be null
        Node<E> oldTail = this.tail;
        this.tail = oldTail.prev;
        this.tail.next = null;
        this.indices.remove(size-1);
        this.size--;
        return oldTail.data;
    }

    /**
     * This method removes and returns the element at the index.
     * @param index the index of the element to be removed
     * @return the data value of the node being removed
     */
    public E removeAt(int index) {
        // if there is no such element.
        if (index < 0 || index > this.size - 1 || this.size == 0) {
            throw new IllegalStateException();
        }
        if (index == 0) {
            return this.remove();
        }
        if (index == this.size-1) {
            return this.removeLast();
        }
        // get current node (n), prev node of the current node (nPrev)
        // and next node of the current node (nNext)
        // if we remove the current node:
        //       nPrev.next -> n.next
        //       nNext.prev -> n.prev
        Node<E> n = this.indices.get(index);
        Node<E> nPrev = n.prev;
        Node<E> nNext = n.next;
        nPrev.next = nNext;
        nNext.prev = nPrev;
        this.size--;
        this.indices.remove(index);
        return n.data;
    }

    /**
     * This method removes the first occurrence of elem in the list
     * @param elem
     * @return returns true if elem was in the list, false if not.
     */
    public boolean remove(E elem) {
        if (this.size == 0) {
            throw new IllegalStateException();
        }
        // iterate from the head to the tail and compare every elem
        // if the elem is found, remove and return true; else return false
        Node<E> current = this.head;
        int index = 0;
//        E elem2 = current.data;
//        System.out.println(elem2.equals(elem));

        /**
         * == operators: reference comparison (address comparison)
         * checks if both objects point to the same memory location
         * Object.equals() method: content comparison.
         * evaluates to the comparison of values in the objects.
         */

        while (current != null && (!current.data.equals(elem))) {
            current = current.next;
            index++;
        }

//        while (current != null && (current.data != elem)) {
//            current = current.next;
//            index++;
//        }

        if (index == this.size) {
            return false;
        } else {
            removeAt(index);
            return true;
        }
    }


    /**
     * This method resents a string representation of the list.
     * @return a string
     */
    public String toString() {
//        "9,8,7,6,5,4,3,2,1,0"
        String res = "";
        if (this.size == 0) {
            return res;
        }
        res += this.head.data;
        Node<E> current = this.head.next;
        for (int index = 1; index < this.size; ++index) {
            res += "," + current.data;
            current = current.next;
        }
        return res;
    }

    public static void main(String[] args) {
//        IDLList<Integer> dll = new IDLList<>();
//
//        for (int i = 0; i < 10; i++) {
//            dll.add(i);
//        }
//        System.out.println(dll);
//        System.out.println(dll.size() - 1);
//
//        System.out.println(dll.get(dll.size() - 1));
//        System.out.println(dll.getLast());
//
//        IDLList<Integer> dll2 = new IDLList<>();
//
//        for (int i = 10; i > -1; i--) {
//            dll2.add(i);
//        }
//
//        System.out.println(dll.get(dll.size() - 1));
//        System.out.println(dll.getLast());
//        System.out.println(dll2.get(5));


//        IDLList<Integer> list2 = new IDLList();
        IDLList<Integer> dll = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dll.add(i);
        }

        dll.append(20);
        dll.append(7);
        dll.add(3, 20);
        System.out.println(dll.toString());
        System.out.println(dll.size);
        System.out.println(dll.remove(20));
        System.out.println(dll.toString());
        System.out.println(dll.size);

        IDLList<Integer> dll2 = new IDLList<>();

        for (int i = 1; i < 10; i++) {
            dll2.append(i);
        }

        IDLList<Character> dll3 = new IDLList<>();

        String a = "hello";

        for (int i=0; i<a.length();i++) {
            dll3.append(a.charAt(i));
        }



    }

}
