package com.icarocamelo.datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomQueueTests {
    @Test
    public void addOneItemIntoQueue(){
        CustomQueue queue = new CustomQueue();
        LinkedListNode node = new LinkedListNode(1);

        queue.offer(node);

        assertEquals(1, queue.size());
    }

    @Test
    public void addMultipleItemsIntoQueue(){
        CustomQueue queue = new CustomQueue();
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);

        queue.offer(node1);
        queue.offer(node2);
        queue.offer(node3);

        assertEquals(3, queue.size());
    }

    @Test
    public void getTail(){
        CustomQueue queue = new CustomQueue();
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);

        queue.offer(node1);
        queue.offer(node2);
        queue.offer(node3);

        assertEquals(3, queue.getTail().data);
    }

    @Test
    public void getHead(){
        CustomQueue queue = new CustomQueue();
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);

        queue.offer(node1);
        queue.offer(node2);
        queue.offer(node3);

        assertEquals(1, queue.getHead().data);
    }

    @Test
    public void getNthElementFromQueue(){
        CustomQueue queue = new CustomQueue();
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);

        queue.offer(node1);
        queue.offer(node2);
        queue.offer(node3);

        assertEquals(3, queue.get(2).data);
    }

    @Test
    public void poll(){
        CustomQueue queue = new CustomQueue();
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);

        queue.offer(node1);
        queue.offer(node2);
        queue.offer(node3);

        LinkedListNode element1 = queue.poll();
        LinkedListNode element2 = queue.poll();
        LinkedListNode element3 = queue.poll();


        assertEquals(1, element1.data);
        assertEquals(2, element2.data);
        assertEquals(3, element3.data);
        assertEquals(0, queue.size());
    }
}
