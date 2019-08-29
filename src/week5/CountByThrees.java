package week5;

//A simple program that counts in multiples of 3, from 3 to 300 inclusive.
//New line ever multiple of 30.
public class CountByThrees {
    public static final int START = 3;
    public static final int END = 300;

    public static void main(String[] args) {
        for (int i = START; i <= END; i += 3) {
            System.out.print(i + " ");
            if (i % 30 == 0) {
                System.out.println();
            }
        }
    }
}
