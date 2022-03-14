package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class removeAll {
    public static void main(String[] args) {
        // Удалить все элементы ArrayList, которые указаны в параметре.
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
        secondList.add("Nine");

        // Удаляет в maiList все значения, которые есть в secondList
        mainlist.removeAll(secondList);

        System.out.println(mainlist);

    }
}
