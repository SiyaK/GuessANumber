
import java.util.Scanner;

public class GuessNumber {

        public static void main(String[] args) {
                int secretNUmber;
                int guess;
                boolean correct = false;

                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter your number: ");
                secretNUmber = scanner.nextInt();

                while (!correct) {
                        System.out.println("Guess a secret number: ");
                        guess = scanner.nextInt();

                        if (guess == secretNUmber) {
                                correct = true;
                                System.out.println("Congratulations!\nYou are correct!");

                        } else if (guess < secretNUmber) {
                                System.out.println("guess higher, try again.");
                        } else {
                                System.out.println("guess lower, try again.");

                        }
                }
        }
}


