package task2ArrayList;

import java.util.Iterator;

/**
 * Created by Alex on 13.03.2019
 */
public class myArrayList<E> implements Custom <E> {

    private E[] values;

    myArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try{
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch(ClassCastException ex) {
            return false;
        }
    }

//    @Override
//    public void delete(int index) {
//        try{
//            E[] temp = values;
//            values = (E[]) new Object[temp.length - 1];
//                System.arraycopy(temp, 0, values, 0, index);
//                System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);
//        } catch(ClassCastException ex) {
//            ex.printStackTrace();
//        }
//    }

    @Override
    public void delete(int index) {
        System.out.println("Deleting is prohibited!!!");
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
