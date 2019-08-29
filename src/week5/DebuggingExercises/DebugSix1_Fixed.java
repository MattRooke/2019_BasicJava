package week5.DebuggingExercises;

// DebugSix1_Fixed.java
// Start with a penny
// double it every day
// how much do you have in a 30-day month?
public class DebugSix1_Fixed {
    public static void main(String[] args) {
        final int DAYS = 30;
        double money = 0.01;
        int day = 1;
        System.out.printf("On day %d you start with %s%n", day, money);
        while (day < DAYS) {
            day += 1;
            money = 2 * money;
            System.out.printf("After day %d you have %s%n", day, money);
        }
    }
}