package com.icarocamelo.datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class CustomSingleLinkedListTests {
    @Test
    public void initLinkedList(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(1);

        LinkedListNode head = linkedList.getHead();

        assertEquals(head.data, 1);
    }

    @Test
    public void addFront(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(1);
        linkedList.addFront(2);

        LinkedListNode head = linkedList.getHead();

        assertEquals(head.data, 2);
        assertEquals(head.next.data, 1);
    }

    @Test
    public void getTail(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        LinkedListNode tail = linkedList.getTail();

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

        LinkedListNode tail = linkedList.getTail();

        assertEquals(tail.data, 4);
    }

    @Test
    public void reverse(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(5);
        linkedList.addFront(1);
        linkedList.addFront(3);
        linkedList.addFront(2);
        linkedList.addFront(0);

        linkedList.reverse();

        assertEquals(linkedList.getHead().data, 5);
    }

    @Test
    public void getNthElement(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(5); // #4
        linkedList.addFront(1); // #3
        linkedList.addFront(3); // #2
        linkedList.addFront(2); // #1
        linkedList.addFront(0); // #0


        assertEquals(linkedList.getNth(3).data, 1);
    }

    @Test
    public void getNullWhenNthIndexIsOutOfBoundaries(){
        CustomSingleLinkedList linkedList = new CustomSingleLinkedList();
        linkedList.addFront(5); // #4
        linkedList.addFront(1); // #3
        linkedList.addFront(3); // #2
        linkedList.addFront(2); // #1
        linkedList.addFront(0); // #0


        assertNull(linkedList.getNth(5));
    }
}
