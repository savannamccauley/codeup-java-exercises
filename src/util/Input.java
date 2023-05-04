package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

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
        System.out.println("Enter a number between " + min + "and " + max);
        int input = scanner.nextInt();
        if (input < min || input > max) {
            return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        int input = scanner.nextInt();
        return input;
    }
    public double getDouble(double min, double max){
        System.out.println("Enter a number between "+ min +"and " + max);
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            return getDouble(min, max);
        }
        return input;

    }
    public double getDouble(){
        return scanner.nextDouble();
    }

}




