package Collections.List.VectorStackExample.LinkedList;

import Collections.model.Student;

import java.util.ArrayList;

public class LinkedListExample {

    public static void main(String[] args) {

        Student st1 = new Student(1,"name1", 1, 'm');
        Student st2 = new Student(2, "name2", 2, 'f');
        Student st3 = new Student(3, "name3", 3, 'f');
        Student st4 = new Student(4, "name4", 4, 'm');
        Student st5 = new Student(5, "name5", 5, 'm');

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
        list1.add(st4);
        list1.add(st5);


        System.out.println("LinkedList All: " + list1);
        System.out.println("LinkedList Element: " + list1.get(1));

        Student st6 = new Student(6, "name6", 6, 'm');
        Student st7 = new Student(7, "name6", 7, 'm');

        list1.add(st6);
        list1.add(st7);

        System.out.println("LinkedList All: " + list1);

        Student st8 = new Student(8,"name8", 8, 'm');

        list1.add(0, st8);

        System.out.println("LinkedList All: " + list1);

        list1.remove(3);

        System.out.println("LinkedList All: " + list1);

    }
}
