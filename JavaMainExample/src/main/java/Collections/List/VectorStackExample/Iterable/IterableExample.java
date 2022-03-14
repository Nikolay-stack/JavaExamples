package Collections.List.VectorStackExample.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableExample {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        Iterator<String> iteratorList = list1.iterator(); // проходит по элементам

//        while(iteratorList.hasNext()){  // выводим все элементы с помощью Iterator
//            // пока есть следующий элемент работает итератор
//            System.out.println(iteratorList.next());
//        }


        while(iteratorList.hasNext()){   // hasNext() - проверяет если есть следующий элемент
            //удаляем элементы
            iteratorList.next(); // получаем следующий элемент следующий элемент. Если уберм next(), выброситься Exception, потому что мы его не получили
            iteratorList.remove(); // удаляем этот элемент
        }

        System.out.println(list1);

    }
}
