package util;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.println("enter a string");
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Enter yes or no:");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y")|| input.equals("yes");
    }
    public int getInt (int min ,int max){
        System.out.println("Enter a number between "+ min +"and "+ max);
        int input = scanner.nextInt();
        return input;
    }
    public int getInt(int input, int min, int max){
        System.out.println("Enter a number between "+ min +"and "+ max);
        if((input > min) && (input <max)){
            return input;
            System.out.println("correct number");
        }else{
            return ;
        }
    }






    public class InputTest {
        public static void main
                (String[] args) {
//        Input input = new Input();
//        String name = input.getString();
//        System.out.println("Hello, " + name + "!");

            Input input = new Input();
            boolean likesPizza = input.yesNo();
            if (likesPizza) {
                System.out.println("Yes");
            } else {
                System.out.println("no");
            }

        }
    }

}
