package week8;

public class GraduateStudent extends Student {

    public GraduateStudent(String studentID, String lastName) {
        super(studentID, lastName);
    }

    public void setAnnualTuition() {
        this.annualTuition = 6000;
    }
}
