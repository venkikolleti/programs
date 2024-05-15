import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Change this to set the lower bound of the random number range
        int upperBound = 100; // Change this to set the upper bound of the random number range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int playerGuess;
        int attempts = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
            }
        } while (playerGuess != randomNumber);

        scanner.close();
    }
}
