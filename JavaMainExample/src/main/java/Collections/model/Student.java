package Collections.model;

public class Student implements Comparable<Student>{
    public int id;
    public String name;
    public int age;
    public char sex;

    public Student(int id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }


    @Override
    public int compareTo(Student newStudent){
        int result = this.id - newStudent.id;
        if(result == 0){
            result = this.name.compareTo(newStudent.name);
        }
        return result;
    }

}
