package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student studentOne = new Student();

    @Test
    void gpa() {
        studentOne.setCreditHours(50);
        studentOne.setPointsEarned(1000);
        assertEquals((float) 1000 / 50, studentOne.gpa(studentOne.getCreditHours(), studentOne.getPointsEarned()));
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

}