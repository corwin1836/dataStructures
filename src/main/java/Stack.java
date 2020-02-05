public class Stack<Item> {
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
}

