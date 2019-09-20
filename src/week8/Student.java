package week8;

public abstract class Student {
    String studentID;
    String lastName;
    float annualTuition;

    public Student(String studentID, String lastName) {
        this.studentID = studentID;
        this.lastName = lastName;
        setAnnualTuition();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getAnnualTuition() {
        return annualTuition;
    }

    public abstract void setAnnualTuition();

    @Override
    public String toString() {
        return "Student\n" +
                " Student ID: " + studentID + '\n' +
                " Last Name: " + lastName + '\n' +
                " Annual Tuition: $" + annualTuition + "0" +
                '\n';
    }
}
