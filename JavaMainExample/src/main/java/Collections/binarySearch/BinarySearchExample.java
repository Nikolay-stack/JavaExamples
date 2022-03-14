package Collections.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

    //   Для использования поиска в мервую очередб надо отсортировать массив по возрастанию
    //   Далее массив делится на 2 половины и проверяется та сторона, где есть наш элемент
    //   эта часть делится еще на половину и так до тех пор, пока не найдем наш элемент
    //   Ищем элемент 19, он у нас на последней позиции , поэтому берется правая часть массива
    //   {-30,-8,-3,0,1,|5|,8,10,12,19,150}   // делим массив на 2 части: первая до 5, вторая после
    //   Далее {8,10,|12|,19,150}    -->    {19,150}   и находим число 19



    //Binary Search для массивов

    public static void main(String[] args) {
//        int[] array = {5, 3, 8, 9, 2, 6, 1, 4, 7, 14, 11, 21, 14};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array, 9);
//        System.out.println(index3);



        // !!!!!!!!!!!!!!!!!!!!!!!!!!             Методы с Collection

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(7);
        list.add(5);
        list.add(7);
        list.add(11);

        System.out.println("List: " + list);

        // Сортирует
        Collections.sort(list);
        System.out.println("Sort list: " + list);

        // Выводит в обратном порядке
        Collections.reverse(list);
        System.out.println("Reverse list: " + list);

        // Пермешивает list
        Collections.shuffle(list);
        System.out.println("Shuffle list: " + list);
    }




    //Binary Search для обьектов
//    public static void main(String[] args) {
//        Student st1 = new Student(1, "name1", 1, 'm');
//        Student st2 = new Student(2, "name2", 2, 'f');
//        Student st3 = new Student(3, "name3", 3, 'f');
//        Student st4 = new Student(4, "name4", 4, 'm');
//        Student st5 = new Student(5, "name5", 5, 'm');
//
//        List<Student> list1 = new ArrayList<>();
//        list1.add(st1);
//        list1.add(st2);
//        list1.add(st3);
//        list1.add(st4);
//        list1.add(st5);
//
//        Collections.sort(list1);
//        System.out.println(list1);
//        int index = Collections.binarySearch(list1, new Student(4, "name4", 4, 'm')) + 1;
//        System.out.println(index);
//
//    }






//    public static void main(String[] args) {        // Главная реализация
//        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
//        int key = 4;
//        int first = 0;
//        int last = array.length-1;
//        int middle = first + last / 2;
//
//        while(first <= last){
//            if(array[middle] < key)
//                first = middle + 1;
//            else if(array[middle] == key) {
//                array[middle] = key;
//                break;
//            }
//            else if(array[middle] > key)
//                last = middle - 1;
//
//            middle = (first + last) / 2;
//        }
//
//
//        if(first > last)
//            System.out.println("Element is not found");
//        else
//            System.out.println("Found element is: "  + array[middle]);
//    }
}
