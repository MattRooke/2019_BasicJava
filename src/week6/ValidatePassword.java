package week6;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Enter a password with at least 2 capital letters, 2 lowercase letter and 2 digits:");
        String newPassword = passwordInput.nextLine();
        boolean notValid = true;
        do {
            int numberUpper = 0;
            int numberLower = 0;
            int numberDigits = 0;
            int length = newPassword.length();
            for (int ch = 0; ch < length; ch++) {
                char currentCh = newPassword.charAt(ch);
                if (Character.isUpperCase(currentCh)) {
                    numberUpper += 1;
                } else if (Character.isLowerCase(currentCh)) {
                    numberLower += 1;
                } else if (Character.isDigit(currentCh)) {
                    numberDigits += 1;
                }

            }
            if (numberUpper >= 2 && numberLower >= 2 && numberDigits >= 2) {
                notValid = false;
                System.out.println("Password Accepted.");
            } else if (numberUpper < 2) {
                System.out.print("Too few Uppercase letters,");
                if (numberLower < 2) {
                    System.out.print(" too few Lowercase letters,");
                }
                if (numberDigits < 2) {
                    System.out.print(" too few digits,");
                }
                System.out.println(" Enter a valid password:");
                newPassword = passwordInput.nextLine();
            } else if (numberLower < 2) {
                System.out.print("Too few Lowercase letters,");
                if (numberDigits < 2) {
                    System.out.print(" too few digits,");
                }
                System.out.println(" Enter a valid password:");
                newPassword = passwordInput.nextLine();
            } else {
                System.out.println("Too few Digits,\nEnter a valid password:");
                newPassword = passwordInput.nextLine();
            }
        } while (notValid);
    }
}
