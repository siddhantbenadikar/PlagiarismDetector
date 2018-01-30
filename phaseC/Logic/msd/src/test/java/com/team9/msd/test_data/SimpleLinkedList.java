package com.team9.msd.test_data;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleLinkedList<Object> implements Iterable<Object> {

    private class Node<Object> {
        private Object val;
        private Node<Object> next;

        public Node(Object e, Node<Object> n) {
            val = e;
            next = n;
        }
    }

    public SimpleLinkedList() {
        length = 0;
        first = last = null;
    }

    public void add(Object e) {
        Node<Object> newNode = new Node<Object>(e, first);
        first = newNode;
        length++;
        if (length == 1) {
            last = first;
        }
    }

    public void append(Object e) {
        if (isEmpty()) {
            add(e);
        }
        else {
            Node<Object> newNode = new Node<Object>(e, null);
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return (length <= 0);
    }

    public Object removeFromFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty list");
        }

        Object ret = first.val;
        first = first.next;
        length--;
        if (length <= 1 ) {
            last = first;
        }
        return ret;
    }

    public Object removeFromEnd() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty list");
        }

        Object ret = last.val;
        if (length == 1) {
            ret = removeFromFront();
        }
        else {
            Node<Object> newLast = first;
            while (newLast.next != last) {
                newLast = newLast.next;
            }
            last = newLast;
            last.next = null;
            length--;
        }
        return ret;
    }

    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty list");
        }
        return first.val;
    }

    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty list");
        }
        return last.val;
    }

    public String toString() {
        String ret = "first -> ";
        Node<Object> current = first;
        while (current!= null ) {
            ret += current.val + " -> ";
            current = current.next;
        }
        return ret += "last";
    }

    @Override
    public Iterator<Object> iterator() {
        return new ListIterator<Object>(first);
    }

    private class ListIterator<Object> implements Iterator<Object> {

        private Node<Object> current;

        public ListIterator(Node<Object> start) {
            current = start;
        }

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Empty list");
            }
            Object ret = current.val;
            current = current.next;
            return ret;
        }

    }

    private int length;
    private Node<Object> first;
    private Node<Object> last;
}
