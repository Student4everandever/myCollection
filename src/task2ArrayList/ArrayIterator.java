package task2ArrayList;

import java.util.Iterator;

/**
 * Created by Alex on 13.03.2019
 */
public class ArrayIterator <E> implements Iterator<E> {
    private int index = 0;
    E [] values;

    ArrayIterator(E [] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
