package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class otherMethods {
    public static void main(String[] args) {
        List<String> mainlist = new ArrayList<>();
        mainlist.add("One");
        mainlist.add("Two");
        mainlist.add("Three");
        mainlist.add("Four");
        mainlist.add("Five");
        System.out.println(mainlist);

        // выводит элементы с 0 по 2, при этом создает не новый лист, а новый образ листа
        System.out.println(mainlist.subList(0,3));

        System.out.println(mainlist);

    }
}
