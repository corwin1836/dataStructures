import java.util.Iterator;

public class ListIterator<Item> implements Iterator<Item> {
    private Node first;
    private Node current = first;

    public class Node {
        Item item;
        Node next;
    }
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
