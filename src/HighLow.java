import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        userGuess();
    }
    public static void userGuess(){
        int random = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        do{
            System.out.println("Guess a number between 1 and 100");
            userGuess = scanner.nextInt();
            if(userGuess< random){
                System.out.println("Higher");
            }
            else if(userGuess < random){
                    System.out.println("lower");
                }else {
                System.out.println("good try");
            }
        }
        while(userGuess != random);
    }
}
