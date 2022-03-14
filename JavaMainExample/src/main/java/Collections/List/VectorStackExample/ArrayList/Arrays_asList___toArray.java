package Collections.List.VectorStackExample.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_asList___toArray {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("One");
        StringBuilder st2 = new StringBuilder("Two");
        StringBuilder st3 = new StringBuilder("Three");
        StringBuilder st4 = new StringBuilder("Four");
        StringBuilder st5 = new StringBuilder("Five");

        // ИЗ МАССИВА В List (Arrays.asList())
        StringBuilder[] array = {st1, st2, st3, st4, st5};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[2].append("!@#"); // добавляем эти знаения к 3 элементу массива
        System.out.println(list);


        // ИЗ LIST В МАССИВ ()

        String s1 = new String("One");
        String s2 = new String("Two");
        String s3 = new String("Three");
        String s4 = new String("Four");
        String s5 = new String("Five");

        List<String> newList = new ArrayList<>();
        newList.add(s1);
        newList.add(s2);
        newList.add(s3);
        newList.add(s4);
        newList.add(s5);


        System.out.println("To Array: " + newList);
        Object[] array1 = newList.toArray();

        for (Object str: array1) {
            System.out.println("Array1: " + str);
        }

        // Если надо преобразовать в конкретный тип массива
        String[] array2 = newList.toArray(new String[0]); // Если list больше чем указанный размер массива
                                                    // new String[0], то java поставит размер листа, поэтому можно поставить 0

        for (String str: array2) {
            System.out.println("Array2: " + str);
        }
    }
}

