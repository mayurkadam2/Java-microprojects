
public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== NUMBER GUESSING GAME =====");
        System.out.println("Guess the secret number between 1 and 100.");
        System.out.println("Try to find it in as few attempts as possible!");
        

        NumberGuessingGame game = new NumberGuessingGame();
        game.start();
    }
}
