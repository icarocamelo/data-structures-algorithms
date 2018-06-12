package com.icarocamelo.datastructures;

public class CustomSingleLinkedList {

    public LinkedListNode getNth(int index) {
        int i = 0;
        LinkedListNode found = null;
        LinkedListNode current = head;

        while(current.next != null){
            if (i == index) {
                found = current;
                break;
            }
            current = current.next;
            i++;
        }

        return found;
    }

    public void addFront(int data) {
        LinkedListNode newLinkedListNode = new LinkedListNode(data);

        if (head == null){
            head = newLinkedListNode;
            return;
        }

        newLinkedListNode.next = head;
        head = newLinkedListNode;
    }

    public LinkedListNode getTail() {
        LinkedListNode current = head;
        System.out.println("Head element: " + current.data);

        while( current.next != null){
            current = current.next;
            System.out.println("Current element: " + current.data);
        }
        return current;
    }

    public void addLast(int data) {
        LinkedListNode newLinkedListNode = new LinkedListNode(data);

        if (head == null){
            head = newLinkedListNode;
            return;
        }

        LinkedListNode current = head;
        while( current.next != null){
            current = current.next;
        }
        current.next = newLinkedListNode;
    }

    public void reverse() {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next;

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

    private LinkedListNode head;

    public LinkedListNode getHead() {
        return head;
    }


}
