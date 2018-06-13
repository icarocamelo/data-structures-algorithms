package com.icarocamelo.datastructures;

public class CustomQueue {
    LinkedListNode head;
    LinkedListNode tail;
    int size;

    public int size() {
        return size;
    }

    public void offer(LinkedListNode item) {
        if (head == null){
            // new head
            head = item;

            // keep reference to the last element
            tail = item;
        } else {
            // add item in the end
            tail.next = item;

            // keep reference to the last element
            tail = item;
        }
        size++;
    }

    public LinkedListNode getTail() {
        return tail;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public LinkedListNode get(int index) {
        int i = 0;
        LinkedListNode current = head;
        while(current != null){
            if (i == index){
                return current;
            }
            current = current.next;
            i++;
        }
        return null;
    }
}
