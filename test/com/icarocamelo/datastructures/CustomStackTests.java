package com.icarocamelo.datastructures;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomStackTests {
    @Test
    public void initStack(){
        CustomStack stack = new CustomStack();
        LinkedListNode linkedListNode = new LinkedListNode(1);
        stack.push(linkedListNode);

        assertEquals(1, stack.getSize());
    }

    @Test
    public void pushMultipleElements(){
        CustomStack stack = new CustomStack();
        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        LinkedListNode linkedListNode2 = new LinkedListNode(2);

        stack.push(linkedListNode1);
        stack.push(linkedListNode2);

        assertEquals(2, stack.getSize());
    }

    @Test
    public void pop(){
        CustomStack stack = new CustomStack();
        LinkedListNode linkedListNode = new LinkedListNode(1);
        stack.push(linkedListNode);

        LinkedListNode head = stack.pop();

        assertEquals(linkedListNode.data, head.data);
        assertEquals(0, stack.getSize());
    }

    @Test
    public void popMultipleElements(){
        CustomStack stack = new CustomStack();
        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        LinkedListNode linkedListNode2 = new LinkedListNode(2);

        stack.push(linkedListNode1);
        stack.push(linkedListNode2);

        LinkedListNode n1 = stack.pop();
        LinkedListNode n2 = stack.pop();

        assertEquals(n1.data, linkedListNode2.data);
        assertEquals(n2.data, linkedListNode1.data);
        assertEquals(0, stack.getSize());
    }

    @Test
    public void top(){
        CustomStack stack = new CustomStack();
        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        LinkedListNode linkedListNode2 = new LinkedListNode(2);
        LinkedListNode linkedListNode3 = new LinkedListNode(3);

        stack.push(linkedListNode1);
        stack.push(linkedListNode2);
        stack.push(linkedListNode3);

        assertEquals(linkedListNode3.data, stack.top().data);
        assertEquals(3, stack.getSize());
    }
}
