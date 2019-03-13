package task2LinkedList;

/**
 * Created by Alex on 13.03.2019
 */
public interface Custom <E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int index);
}
