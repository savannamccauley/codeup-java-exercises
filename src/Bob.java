import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean confirm;

        do {
            System.out.println("What would you like to ask Bob:");
            input = scanner.nextLine();

            if (input.contains("?")) {
                System.out.println("Of course");
            } else if (input.contains("!")) {
                ;
                System.out.println("Totally!");
            } else if (input.equals("")) {
                System.out.println("Fine bro");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you like to continue chatting. [y/n]");
            confirm = scanner.nextLine().equalsIgnoreCase("y");

        } while (confirm);
        System.out.println("Good chatting bruv");
    }
}