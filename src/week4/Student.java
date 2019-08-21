package week4;

public class Student {
    private int idNumber;
    private float creditHours;
    private float pointsEarned;

    public Student() {
        idNumber = 9999;
        creditHours = 3;
        pointsEarned = 12;
    }

    public float gpa(float pointsEarned, float creditHours) {
        return pointsEarned / creditHours;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public float getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(float creditHours) {
        this.creditHours = creditHours;
    }

    public float getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(float pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}
