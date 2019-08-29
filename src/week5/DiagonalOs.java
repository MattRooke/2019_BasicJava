package week5;

public class DiagonalOs {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("O%n");
            for (int s = i; s > 0; s--)
                System.out.print(" ");
        }
    }
}
