package task2LinkedList;

import java.util.Iterator;

/**
 * Created by Alex on 13.03.2019
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> linkedString = new MyLinkedList<>();
        linkedString.addLast("Last");
        linkedString.addFirst("First");
        System.out.println(linkedString.size());
        System.out.println(linkedString.getElementByIndex(0));
        System.out.println(linkedString.getElementByIndex(1));
        linkedString.addLast("LastLast");
        System.out.println(linkedString.getElementByIndex(2));
        System.out.println(linkedString.size());

        for(String s : linkedString) {
            System.out.println(s);
        }

        System.out.println("\n" + "Reverse:");
        Iterator iterator = linkedString.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
