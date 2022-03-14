package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class List_Of_CopyOf {
    public static void main(String[] args) {

        // Эти листы нельзя модифицировать и они не могут содержать значения null

        // ВМЕСТО ДОБАВЛЕНИЯ КАЖДОГО ЭЛЕМЕНТА В ЛИСТ ЧЕРЕЗ МЕТОД ADD, ИСПОЛЬЗУЕМ МЕТОД LIST.OF(.....)
        // НО проблема в том, что мы не можем изменять такой лист
        List<String> list = List.of("one", "two", "three", "four", "five");
        System.out.println(list);


        // копирует все элементы из list в параметре и является неизменяемым
        List<String> mainlist = new ArrayList<>();
        mainlist.add("One");
        mainlist.add("Two");
        mainlist.add("Three");
        mainlist.add("Four");
        mainlist.add("Five");

        List<String> copyList = List.copyOf(mainlist);
        System.out.println(copyList);
    }
}
