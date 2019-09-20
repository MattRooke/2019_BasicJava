package week8;

import java.util.ArrayList;

public class StudentDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new GraduateStudent("001", "Smith"));
        students.add(new GraduateStudent("002", "Jones"));
        students.add(new UndergraduateStudent("003", "Rooke"));
        students.add(new UndergraduateStudent("004", "Bowman"));
        students.add(new StudentAtLarge("005", "Johnston"));
        students.add(new StudentAtLarge("006", "Tinus"));

        for (Student student : students
        ) {
            System.out.println(student);
        }

    }
}
