import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      int numToGuess = rand.nextInt(100) + 1;
      int numGuesses = 0;
      int guess;

      System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

      do {
         System.out.print("Enter your guess: ");
         guess = sc.nextInt();
         numGuesses++;

         if (guess < numToGuess) {
            System.out.println("Too low! Try again.");
         } else if (guess > numToGuess) {
            System.out.println("Too high! Try again.");
         } else {
            System.out.println("Congratulations, you guessed the number in " + numGuesses + " guesses!");
         }
      } while (guess != numToGuess);
   }
}
