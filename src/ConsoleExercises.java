import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main
            (String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately: %.2f ", pi) ;

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number");
//        int userNum = scanner.nextInt();
//        System.out.print("Your number is: " + userNum);
        
        //---------------------------------------------------------------------------------
//        System.out.print("Enter a 3 words");
//
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.printf("%s %s %s", wordOne,wordTwo,wordThree
//        ---------------------------------------------------------------------------------
//                System.out.print("Enter a sentence");
//                String sentence = scanner.nextLine();
//                System.out.print("Your sentence is: " + sentence);
//---------------------------------------------------------------------------------
                System.out.print("Enter a length");

                String length = scanner.next();
                System.out.print("Enter a width");

                String width = scanner.next();

                int lConvert = parseInt(length);
                int wConvert = parseInt(width);

                System.out.println("The area is : " + lConvert * wConvert);
                System.out.println("The perimeter is : " + ((lConvert * 2) + (wConvert * 2)));





    }

}
