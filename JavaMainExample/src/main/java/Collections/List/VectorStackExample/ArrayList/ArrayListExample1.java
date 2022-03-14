package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        list1.clear();
        System.out.println("List1 " + list1);

        List<String> list2 = new ArrayList<>(3);
        list2.add("one1");
        list2.add("two1");
        list2.add("three1");
        list2.add("four");
        list2.add(3, "five"); // элемент five добавляется на 3 от 0 позицию (то есть на 4 элемент)

        list2.set(2, "New Three Element");

        list2.remove(0);
        list2.remove("four");

        list2.addAll(list1);   // добавляются все элементы list1

        list2.addAll(0, list1);   // добавляются все значения list1 на 0 позицию

        int index = list2.indexOf("five"); // индекс, на котором находится элемент five


        System.out.println("IndexOf: " + index);

        System.out.println("List2 " + list2);

        List<String> list3 = new ArrayList<>(list1);
        System.out.println("List3 " + list3);


        System.out.println(list1 == list3);  // ссылается на обьекты (смотрит по ссылке)
        System.out.println(list1.equals(list3));   // смотрит на содержимое

        System.out.println(list2.get(2));

    }
}
