import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuessNumber {

    private static final Map<Integer, Integer> DIFFICULTY_LEVELS = new HashMap<>();

    static {
        DIFFICULTY_LEVELS.put(1, 10);  // Easy
        DIFFICULTY_LEVELS.put(2, 5);   // Medium
        DIFFICULTY_LEVELS.put(3, 3);   // Hard
    }

    public void guessNumberMainCLI() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Guess the Number Game");
            System.out.println("++++++++++++++++++++++++++++++++++++\n");
            System.out.println("Choose your difficulty level:");
            System.out.println("1. Easy (10 guesses)");
            System.out.println("2. Medium (5 guesses)");
            System.out.println("3. Hard (3 guesses)");

            int difficulty = sc.nextInt();
            int retriesLeft = DIFFICULTY_LEVELS.getOrDefault(difficulty, 10);  // Default to Easy if invalid choice

            System.out.println("You have " + retriesLeft + " guesses to guess the number.");
            int targetNumber = (int) (Math.random() * 100 + 1);

            System.out.println("Guess a number between 1 and 100");

            while (retriesLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == targetNumber) {
                    System.out.println("🎉 Congratulations! You guessed correctly! The number was " + targetNumber);
                    return;
                }

                retriesLeft--;
                if (retriesLeft > 0) {
                    System.out.println("Your number is " + (guess < targetNumber ? "lower" : "higher") + " than the actual one. Try again.");
                    System.out.println("Remaining attempts: " + retriesLeft);
                } else {
                    System.out.println("❌ You've exhausted all your guesses. The correct number was " + targetNumber);
                }
            }
        }
    }


}
