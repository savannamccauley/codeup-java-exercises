import java.util.Scanner;

public class MyFirstClass {

   public static void main
           (String[] args){
//       String name = "codeup";
//       System.out.printf("Hello there, %s. Nice to see you.%n", name);
//
       Scanner scanner = new Scanner(System.in);
//       System.out.print("What is the day today?");
//       String userInput = scanner.nextLine();
//
//       System.out.println("You entered: --> \"" + userInput + "\" <--");


       System.out.println("Enter a number: ");
       int userNum = scanner.nextInt();
       System.out.println("Your number is: " + userNum);

   }
}
