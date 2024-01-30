import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        boolean guessedCorrect = false;
        while(!guessedCorrect) {

            System.out.println("Enter a number between 0-100");
            int guess = input.nextInt();
            if (guess == randomNumber) {
                System.out.println("Congrats.You won!");
            } else if (guess > randomNumber) {
                System.out.println("Try again.The number was lower");
            } else {
                System.out.println("Try again. The number is higher");
            }
        }
    }
}
