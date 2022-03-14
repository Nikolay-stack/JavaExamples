package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class containsAll {
    public static void main(String[] args) {
        // проверяет содержит ли ArrayList все элементы из параметра

        List<String> mainlist = new ArrayList<>();
        mainlist.add("One");
        mainlist.add("Two");
        mainlist.add("Three");
        mainlist.add("Four");
        mainlist.add("Five");
        System.out.println(mainlist);


        List<String> secondList = new ArrayList<>();
        secondList.add("Two");
        secondList.add("Three");

        // проверяет если в maiList есть все значения, которые есть в secondList
        System.out.println(mainlist.containsAll(secondList));
    }
}
