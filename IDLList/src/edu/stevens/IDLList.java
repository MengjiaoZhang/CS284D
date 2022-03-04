package edu.stevens;

import java.util.ArrayList;

public class IDLList <E> {

//    inner class Node<E>
    private class Node <E> {
//        data fields
//        private E data;
//        private Node<E> next;
//        private Node<E> prev;

//        constructor1
        /**
         * This constructor creates a node holding elem
         * The next and prev pointing to null
         *         prev|elem|next
         *         null|elem|null
         * @param elem : data to be stored in the Node
         */
        public Node (E elem){
//            assign values to the variables in the data fields.
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
//            assign values to the variables in the data fields.
            }
        }

//    data fields of IDLList Class
//    private Node<E> head;
//    private Node<E> tail;
//    private int size;
//    private ArrayList<Node<E>> indices;

//    Constructor for IDLList
    /**
     * This constructor creates an empty IDLList
     * Head and tail are set to null and size is set to zero.
     * assign an empty ArrayList to indices and what will be stored in ArrayList are nodes' references
     */
    public IDLList() {

    }

//    methods

    /**
     * This method add elem at the head. (it becomes the first element of the list)
     * @param elem the elem to be placed to be placed at the head.
     * @return always return ture
     */
    public boolean add(E elem) {
        // if the list is empty
        // create a new node with prev being null and next being null
        // both head and tail will point to this node

        // if the list is not empty
        // get the reference of the first node. (oldfirst)
        // create a new node:
        //     the head point to this new node (newfirst)
        //     the next of this new node point to the old first node
        //     the prev of the oldfirst node point to the new node.
    }

    /**
     * This method add elem at position index and use the index for fast access
     * @param index the position in which the elem to be placed in the IDLL
     * @param elem the elem to be placed
     * @return always return true
     */
    public boolean add(int index, E elem){
        // Invalid index, throw IllegalArgumentException()

        // if the index is 0, use the add(E elem) to add elem at head
        // else if the index is this.size - 1, the elem is added at the tail
            // call append(elem)
        // else:
        //     get the current node at the input index and the prev node of current node
        //     create a new node: prev -> prev node of current node
        //                        next -> current node
        //     for the prev node of current node: the next of it is the new node
        //     for the current node: the prev is the new node
            

        // update the size of the IDLList and the indices
    }

    /**
     * This method adds elem as the new last element of the list (i.e. at the tail).
     * @param elem the elem to be placed at the tail
     * @return always return true
     */
    public boolean append (E elem) {
        // call add(int index, E elem)
        // the index should be this.size - 1

    }

    /**
     * This method returns the object at position index from the head. It uses the index for fast access
     * The return type is E, which is the element type.
     * @param index the index of the node
     * @return the data value of that node
     */
    public E get(int index) {
        // if the index is invaild, throw IllegalArgumentException
        // else: return the data of the node at the input index

    }

    /**
     * This method returns the object at the head.
     * The return type is E, which is the element type.
     * @return the data value at the head
     */
    public E getHead() {
        // if the list is empty, throw IllegalArgumentException()
        // else: return the data value of the head;
    }

    /**
     * This method returns the object at the tail.
     * The return type is E, which is the element type.
     * @return the data value at the tail
     */
    public E getLast() {
        //    if the list is empty, throw IllegalArgumentException()
        //    else: return the data value of the tail;
    }

    /**
     * this method returns the list size.
     * @return the size of the list
     */
    public int size() {
        // return the size of the list
    }

    /**
     * removes and returns the element at the head.
     * Should throw an IllegalStateException if there is no such element.
     * @return the data value of the head being removed
     */
    public E remove() {
        // if there is no head (head is null), throw IllegalStateException();

        // if this list only has 1 node, return the data value of the head
        // update the variable values of the data filed

        // if more the one nodes:
        //     get the oldhead of the list
        //     if we remove the oldhead:
        //         the new head will be oldhead.next
        //         the prev of the new head will be null
        //         update the values of the data fields if needed
        //         return the data value of the head
    }

    /**
     * This method removes and returns the element at the tail.
     * Should throw an IllegalStateException if there is no such element.
     * @return the data value of the tail being removed
     */
    public E removeLast() {
        // if the list is empty, throw IllegalStateException()

        // if only 1 node in the list, call remove()

        // if more than 1 node
        //     get the oldTail of the list
        //     if we remove the oldtail:
        //         the new tail will be oldtail.prev
        //         the next of the new tail will be null
        //         update the values of the data fields if needed
        //         return the data value of the tail
    }

    /**
     * This method removes and returns the element at the index.
     * @param index the index of the element to be removed
     * @return the data value of the node being removed
     */
    public E removeAt(int index) {
        // if there is no such element: throw IllegalStateException.
        // if the node is the head or the tail
        // get current node (n), prev node of the current node (nPrev)
        // and next node of the current node (nNext)
        // if we remove the current node:
        //       nPrev.next -> n.next
        //       nNext.prev -> n.prev
        //       update the variable values in data fields
    }

    /**
     * This method removes the first occurrence of elem in the list
     * @param elem
     * @return returns true if elem was in the list, false if not.
     */
    public boolean remove(E elem) {
        //if the list is empty : throw IllegalStateException()

        // iterate from the head to the tail and compare every elem
        // if the elem is found, remove and return true; else return false
    }

    /**
     * This method resents a string representation of the list.
     * @return a string
     */
    public String toString() {
//        for example "9,8,7,6,5,4,3,2,1,0"
//        start from the empty string
//        add elem to the string
//        can use + to do concatenation
    }


}
