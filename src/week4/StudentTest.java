package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student studentOne = new Student();

    @Test
    void gpa() {
        studentOne.setCreditHours(3);
        studentOne.setPointsEarned(12);
        assertEquals((float) 12 / 3, studentOne.gpa(studentOne.getPointsEarned(), studentOne.getCreditHours()));
    }

    @Test
    void getIdNumber() {
        studentOne.setIdNumber(1);
        assertEquals(1, studentOne.getIdNumber());
    }

    @Test
    void getCreditHours() {
        studentOne.setCreditHours(5);
        assertEquals(5, studentOne.getCreditHours());
    }

    @Test
    void getPointsEarned() {
        studentOne.setPointsEarned(100);
        assertEquals(100, studentOne.getPointsEarned());
    }

    @Test
    void initialiser() {
        Student defaultStudent = new Student();
        assertEquals(9999, defaultStudent.getIdNumber());
        assertEquals(12, defaultStudent.getPointsEarned());
        assertEquals(3, defaultStudent.getCreditHours());
    }

}