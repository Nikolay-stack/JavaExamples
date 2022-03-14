package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class retainAll {

    public static void main(String[] args) {
        // Оставит те элементы, которые есть в листе из параметра

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

        // Оставляет в maiList все значения, которые есть в secondList и удаляет все остальное
        mainlist.retainAll(secondList);

        System.out.println(mainlist);

    }

}
