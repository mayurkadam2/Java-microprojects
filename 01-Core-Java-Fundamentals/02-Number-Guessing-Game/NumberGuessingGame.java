import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private final Random rand = new Random();
    private static final int MAX_ATTEMPTS = 7;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private int attemptsUsed = 0;
    private int target;

    private boolean playerWin = false;

    private void guessTarget() {
        target = rand.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }


    private final Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Game Started!");
        guessTarget();
        while (attemptsUsed < MAX_ATTEMPTS && !playerWin) {
            try {
                System.out.println("Attempt Remaining: " +( MAX_ATTEMPTS - attemptsUsed));
                System.out.print("Guess a Number: ");
                int userGuess = sc.nextInt();

                if (userGuess < MIN_NUMBER || userGuess > MAX_NUMBER) {
                    System.out.println("Out of range! Enter a number between 1 and 100.");
                } else {
                    attemptsUsed++;
                    if (userGuess < target) {
                        System.out.println("Too low!");
                    } else if (userGuess > target) {
                        System.out.println("Too high!");
                    } else {
                        System.out.println("Correct! You guessed the number.");
                        System.out.println("Attempts Used: " + attemptsUsed);
                        playerWin = true;
                    }

                }

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input! Enter an integer.");
                sc.nextLine();
            }
        }

        if (!playerWin) {
            System.out.println("Game over!");
            System.out.println("The Secret Number was: " + target);
        }

        sc.close();

    }
}
