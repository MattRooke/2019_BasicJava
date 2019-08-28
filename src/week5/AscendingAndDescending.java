package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {
        AscendingAndDescending sorter = new AscendingAndDescending();
        int first = sorter.getUserInput();
        int second = sorter.getUserInput();
        int third = sorter.getUserInput();
        sorter.sortNumbers(first, second, third);
    }

    public int getUserInput() {
        System.out.println("Enter an integer...");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    public void sortNumbers(int first, int second, int third) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
    }
}
