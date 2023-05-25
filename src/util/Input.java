package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("enter a string");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public static int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max + ":");
        try {
            String input = scanner.nextLine();
            int value = Integer.valueOf(input);
            if (value < min || value > max) {
                System.out.println("Input out of range. Try again.");
                return getInt(min, max);
            }
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return getInt(min, max);
        }
    }


    public int getInt() {
        try {
            String input = scanner.nextLine();
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return getInt();
        }
    }

    public static double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max + ":");
        try {
            String input = scanner.nextLine();
            double value = Double.valueOf(input);
            if (value < min || value > max) {
                System.out.println("Input out of range. Try again.");
                return getDouble(min, max);
            }
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double.");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        try {
            String input = scanner.nextLine();
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double.");
            return getDouble();
        }
    }
}





