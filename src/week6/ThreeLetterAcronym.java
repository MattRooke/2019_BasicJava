package week6;

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words to generate their acronym;");
        String words = input.nextLine();
        StringBuilder acronym = new StringBuilder();
        String firstLetter;
        int length = words.length();
        int letters = 0;
        firstLetter = words.substring(0, 1);
        String firstLetterUpper = firstLetter.toUpperCase();
        acronym.append(firstLetterUpper);
        letters += 1;
        for (int x = 0; x < length; x++)
            if (words.charAt(x) == ' ' && letters < 3) {
                firstLetter = words.substring(x + 1, x + 2);
                firstLetterUpper = firstLetter.toUpperCase();
                acronym.append(firstLetterUpper);
                letters += 1;
            }
        System.out.println(acronym);
    }
}
