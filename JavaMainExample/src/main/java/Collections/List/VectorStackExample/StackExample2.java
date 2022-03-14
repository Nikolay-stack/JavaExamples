package Collections.List.VectorStackExample;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("one");         //     Вставляет элементы
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push( "five");
        System.out.println(stack);
        System.out.println(stack.peek());   // Возвращает последний элемент

        while(!stack.empty()) {
            System.out.println(stack.pop());      // Выбирает и удаляет последний элемент
            System.out.println(stack);
        }


    }
}
