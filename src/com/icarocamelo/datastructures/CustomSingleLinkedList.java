package com.icarocamelo.datastructures;

public class CustomSingleLinkedList {

    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public Node getTail() {
        Node current = head;
        System.out.println("Head element: " + current.data);

        while( current.next != null){
            current = current.next;
            System.out.println("Current element: " + current.data);
        }
        return current;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while( current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next;

        while(current.next != null){
            // set next element
            next = current.next;

            // reversing link
            current.next = previous;

            // set previous to current element
            previous = current;

            // set next to be the current
            current = next;

            // update head
            head = current;
        }
    }

    private Node head;

    public Node getHead() {
        return head;
    }


}
