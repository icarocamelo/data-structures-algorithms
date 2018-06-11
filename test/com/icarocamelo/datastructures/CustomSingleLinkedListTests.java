package com.icarocamelo.datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomSingleLinkedListTests {
    @Test
    public void initLinkedList(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(1);

        CustomSingleLinkedList.Node head = linkedList.getHead();

        assertEquals(head.data, 1);
    }

    @Test
    public void addFront(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(1);
        linkedList.addFront(2);

        CustomSingleLinkedList.Node head = linkedList.getHead();

        assertEquals(head.data, 2);
        assertEquals(head.next.data, 1);
    }

    @Test
    public void getTail(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        CustomSingleLinkedList.Node tail = linkedList.getTail();

        assertEquals(tail.data, 1);
    }

    @Test
    public void addLast(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(1);

        linkedList.addLast(4);

        linkedList.addFront(5);

        CustomSingleLinkedList.Node tail = linkedList.getTail();

        assertEquals(tail.data, 4);
    }
}
