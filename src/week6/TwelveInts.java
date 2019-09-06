package week6;

public class TwelveInts {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
