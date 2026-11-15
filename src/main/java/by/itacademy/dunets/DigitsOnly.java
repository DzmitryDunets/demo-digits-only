package by.itacademy.dunets;

import java.util.Scanner;

public class DigitsOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        boolean hasDigitsOnly = true;

        if (text.isEmpty()) {
            System.out.println("Строка пустая.");
            return;
        }

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                hasDigitsOnly = false;
                System.out.println("Строка содержит другие символы помимо цифр.");
                break;
            }
        }
        if (hasDigitsOnly) {
            System.out.println("Строка состоит только из цифр!");
        }
    }
}
