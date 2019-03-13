package task1;

import java.util.*;

/**
 * Created by Alex on 13.03.2019
 */
public class Task1 {
    Map<Integer, Integer> map = new TreeMap<>();

    public void countRepetitions(List list) {
        for(Object i : list) {
        map.put((Integer) i, map.containsKey(i)?map.get(i)+1:1);
        }
    }

    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);

        Task1 t = new Task1();
        t.countRepetitions(list);
        System.out.println(t.map);
    }
}