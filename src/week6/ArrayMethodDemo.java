package week6;

public class ArrayMethodDemo {

    static final int[] TEN_INTS = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        ArrayMethodDemo demo = new ArrayMethodDemo();
        demo.printInts(TEN_INTS);
        demo.reverseInts(TEN_INTS);
        demo.sumInts(TEN_INTS);
    }

    void printInts(int[] array) {
        System.out.println("The 10 Numbers are:");
        for (int number : array
        ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    void reverseInts(int[] array) {
        System.out.println("The 10 Numbers in reverse order are:");
        for (int number = array.length; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    void sumInts(int[] array) {
        System.out.println("The sum of the 10 Numbers is:");
        int sum = 0;
        for (int number : array
        ) {
            sum += number;
        }
        System.out.println(sum);
    }
}
