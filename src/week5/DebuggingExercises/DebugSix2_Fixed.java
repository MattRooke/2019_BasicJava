package week5.DebuggingExercises;

// DebugSix2_Fixed.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
public class DebugSix2_Fixed {
    final static int MIN = 65;
    final static int MAX = 122;

    public static void main(String[] args) {
        for (int a = MIN; a <= MAX; a++) {
            char letter = (char) a;
            System.out.print("  " + letter);
            if ((stopLines(20, a))) {
                System.out.println();
            }
        }
        System.out.println("\nEnd of application");
    }

    //Method finds when desired number of chars have been printed
    public static boolean stopLines(int lines, int currentLine) {
        return ((currentLine + 1) - MIN) % (lines) == 0;
    }
}