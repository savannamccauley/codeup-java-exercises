import java.util.Scanner;
import java.lang.Math;

public class MethodExercises {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        return getInteger(min, max);
    }

    public static long factorial() {
        int userFactorial = getInteger(1, 10);
        long startNumber = 1;
        for (int i = 1; i <= userFactorial; i++) {
            startNumber *= i;
        }
        boolean choice = userContinue();
        if (choice) {
            factorial();
        }
        System.out.println(startNumber);
        return startNumber;
    }

    public static boolean userContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter y or n");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static String dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many side does you dice have?");
        int side = scanner.nextInt();
        int dice1 = (int) ((Math.random() * side) + 1);
        int dice2 = (int) ((Math.random() * side) + 1);
        return "dice #1 = " + dice1 + " dice #2 =" + dice2;
    }


    public static void main(String[] args) {
        getInteger(1, 3);
        System.out.println(factorial());
        System.out.println(dice());
    }
}
