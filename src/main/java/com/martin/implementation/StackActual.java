package com.martin.implementation;

import java.util.Iterator;

public class StackActual<Item> implements Iterable<Item> {
        private Node first; //top of Stack
        private int N; //size of stack

        //    private Iterator<Item> iterator = new ListIterator<Object>();
        private class Node {
            Item item;
            Node next;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public int size() {
            return N;
        }

        public void push(Item item) {
            //add item to top of stack
            Node oldFirst = first;
            first = new Node();
            first.item = item;
            first.next = oldFirst;
            N++;
        }

        public Item pop() {
            //remove item from top of stack.
            Item item = first.item;
            first = first.next;
            N--;
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
