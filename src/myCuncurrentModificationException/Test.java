package myCuncurrentModificationException;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex on 13.03.2019
 */
public class Test {
    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();
        ints.add(3);
        ints.add(1);
        ints.add(9);
        ints.add(5);

        for (int i: ints) {
            ints.remove(i);
        }
    }
}
