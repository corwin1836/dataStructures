package com.martin.implementation;

import java.util.Iterator;

public class QueueActual<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        //nested class to define nodes
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue (Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
            N++;
        }
    }

    public Item dequeue() {
        //remove item from the beginning of the list
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    public class ListIterator implements Iterator<Item> {

        private Node current = first;


        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = first.item;
            current = current.next;
            return item;
        }
    }
}
