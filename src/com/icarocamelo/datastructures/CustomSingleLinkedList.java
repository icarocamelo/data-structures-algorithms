package com.icarocamelo.datastructures;

public class CustomSingleLinkedList {

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

    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    private Node head;

    public Node getHead() {
        return head;
    }


}
