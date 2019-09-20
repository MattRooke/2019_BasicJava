package week8;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String studentID, String lastName) {
        super(studentID, lastName);
    }

    public void setAnnualTuition() {
        this.annualTuition = 4000;
    }
}
