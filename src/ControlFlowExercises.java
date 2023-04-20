import java.util.Scanner;

public class ControlFlowExercises {
    public static void main
            (String[] args) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }

//        int i = 5;
//        while (i<=15){
//            System.out.print(i);
//            i++;
//        }
        //-----------------------------
//        int i = 0;
//        do {
//           System.out.print(i);
//           i+=2;
//        } while (i<=100);
        //-----------------------------
//
//        int i = 100;
//        do{
//            System.out.print(" "+i+" ");
//            i -=5;
//        } while (i >= -10);
//
        //--------------------------------
//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1_000_000);
//
//    }
        //-------------------------------------
//    for(long i=2;i<=1_000_000; i *=i){
//        System.out.println(i);
//    }
        //-------------------------------
//        for ( int i = 5; i <=15 ; i ++){
//            System.out.println(" " +i+ " ");
//        }
        //---------------------------------

//        for ( int i = 0; i <= 100; i+=2){
//            System.out.println(" "+ i + " ");
//        }
        //----------------------------------
//        for ( int i = 100; i >= -10 ; i -=5){
//            System.out.println(" "+ i + " ");
//        }

        //------------------------------------

//        for (int i = 0; i <= 100; i++) {
//
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//
//            }
//
//            System.out.println(" " + i + " ");
//        }

        //-------------------------------------
        Scanner scanner = new Scanner(System.in);
//        int num;
//        String choice;
//
//        do {
//            System.out.print("Enter an integer: ");
//            num = scanner.nextInt();
//            System.out.println("Number\tSquare\tCube");
//            for (int i = 1; i <= num; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.println(i + "\t" + square + "\t" + cube);
//            }
//            System.out.print("Do you want to continue? (y/n): ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("y"));
////
//        boolean confirm = true;
//        do {
//            System.out.println("Enter a numerical grade from 0-100");
//            int userGrade = scanner.nextInt();
//
//            if (userGrade >= 88) {
//                System.out.println("A");
//            } else if (userGrade >= 80) {
//                System.out.println("B");
//            } else if (userGrade >= 67) {
//                System.out.println("C");
//            } else if (userGrade >= 60) {
//                System.out.println("D");
//            } else if (userGrade >= 0) {
//                System.out.println("F");
//            }
//            System.out.println("Continue [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        }while(confirm);
//        System.out.println("bye bye");
//    }
}






