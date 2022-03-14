package Collections.List.VectorStackExample;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> list2 = new Vector<>();
        list2.add("one1");
        list2.add("two1");
        list2.add("three1");
        list2.add("four");

        System.out.println(list2);

        System.out.println(list2.firstElement());
        System.out.println(list2.lastElement());

        System.out.println(list2);
        list2.remove(3);
        System.out.println(list2);
        System.out.println(list2.get(1));

    }
}
