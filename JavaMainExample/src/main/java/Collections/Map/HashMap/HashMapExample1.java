package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
//        Создаем map ключ - номер паспорта, значение - фамилия имя

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(11111, "Marunevici N");
        map1.put(22222, "Nicitenco A");
        map1.put(33333, "Nicitenco D");
        map1.put(44444, "Fliostor A");
        map1.put(33333, "Ciobanu A");
        map1.putIfAbsent(55555, "Sidorov I");
        map1.putIfAbsent(22222, "Sidorov I");
        System.out.println(map1);
        System.out.println(map1.get(11111));

        System.out.println(map1.containsValue("Ciobanu A"));
        System.out.println(map1.containsKey(11111));

        System.out.println(map1.keySet());   // выводит множество всех ключей
        System.out.println(map1.values());   // выводит множество всех значений



    }
}
