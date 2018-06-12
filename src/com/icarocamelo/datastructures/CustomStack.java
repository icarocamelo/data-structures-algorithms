package com.icarocamelo.datastructures;

public class CustomStack {
    LinkedListNode head;
    private int size;

    public void push(LinkedListNode linkedListNode) {
        if (head == null){
            head = linkedListNode;
        } else {
            linkedListNode.next = head;
            head = linkedListNode;
        }
        size++;
    }

    public LinkedListNode pop() {
        if (head == null){
            return null;
        }
        LinkedListNode oldHead = head;
        head = head.next;
        size--;
        return oldHead;
    }

    public int getSize() {
        return size;
    }

    public LinkedListNode top() {
        return head;
    }
}
