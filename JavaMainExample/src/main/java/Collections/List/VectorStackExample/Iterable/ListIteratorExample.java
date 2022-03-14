package Collections.List.VectorStackExample.Iterable;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        String str = "madam";
        List<Character> list = new LinkedList<>();
        boolean isPalendrome = false;

        for(char ch: str.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> characterListIteratorBegin = list.listIterator();
        ListIterator<Character> characterListIteratorEnd = list.listIterator(list.size());


        while(characterListIteratorBegin.hasNext() && characterListIteratorEnd.hasPrevious()){
            isPalendrome = characterListIteratorBegin.next().equals(characterListIteratorEnd.previous());
        }

        if(isPalendrome)
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");

    }
}
