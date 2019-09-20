package week8;

public class StudentAtLarge extends Student {

    public StudentAtLarge(String studentID, String lastName) {
        super(studentID, lastName);
    }

    public void setAnnualTuition() {
        this.annualTuition = 2000;
    }
}
