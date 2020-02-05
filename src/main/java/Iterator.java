import java.util.ListIterator;

public interface Iterator<Item> {
    boolean hasNext();
    void remove();
    Item next();
}
