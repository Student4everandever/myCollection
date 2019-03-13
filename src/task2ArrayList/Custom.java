package task2ArrayList;

/**
 * Created by Alex on 13.03.2019
 */
public interface Custom <E> extends Iterable <E> {
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
