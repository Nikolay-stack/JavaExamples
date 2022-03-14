package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {

    public static void main(String[] args) {

        Student student1 = new Student("name1", "surname1", 10);
        Student student2 = new Student("name2", "surname2", 11);
        Student student3 = new Student("name3", "surname3", 12);
        Student student4 = new Student("name4", "surname4", 13);
        Student student5 = new Student("name5", "surname5", 14);

        // Студент\оценка
        Map<Student, Integer> map = new HashMap<>();
        map.put(student1, 10);
        map.put(student2, 15);
        map.put(student3, 20);
        map.put(student4, 25);
        map.put(student5, 30);

        System.out.println(map);
        Student student6 = new Student("name2", "surname2", 11);
//        boolean result = map.containsKey(student6);
//        System.out.println(result);

        System.out.println(student2.equals(student6));
        System.out.println(student2.hashCode());
        System.out.println(student6.hashCode());
    }
}

    class Student{
        String name;
        String surname;
        int course;


        public Student(String name, String surname, int course){
            this.name = name;
            this.surname = surname;
            this.course = course;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", course=" + course +
                    '}';
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, course);
        }
    }