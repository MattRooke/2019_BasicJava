package week5.DebuggingExercises;

// DebugSix2_Fixed.java
// Display every character between Unicode 65 and 122
// Start new line after 20 characters
public class DebugSix2_Fixed {
    final static int MIN = 65;
    final static int MAX = 122;
    final static int LINES = 20;
    public static void main(String[] args) {
        int currentLine = 1;
        for (int a = MIN; a <= MAX; a++) {
            char letter = (char) a;
            System.out.print("  " + letter);
            if (currentLine % LINES == 0) {
                System.out.println();
            }
            currentLine++;
        }
        System.out.println("\nEnd of application");
    }
}