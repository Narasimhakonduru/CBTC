import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int attempts = 0;
        int maxAttempts = 10;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                score += (maxAttempts - attempts + 1) * 10; // Calculate score based on attempts
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("The number is higher. Attempts left: " + (maxAttempts - attempts));
            } else {
                System.out.println("The number is lower. Attempts left: " + (maxAttempts - attempts));
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Out of attempts. The correct number was: " + targetNumber);
        }

        System.out.println("Your final score: " + score);
        scanner.close();
    }
}
