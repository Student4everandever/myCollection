package task2ArrayList;

/**
 * Created by Alex on 13.03.2019
 */
public class Main {
    public static void main(String [] args) {
        Custom<String> strings = new myArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Tree");

        System.out.println(strings.get(1));
        System.out.println(strings.size());
        strings.update(0, "First");
        strings.delete(2);
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));
    }
}
