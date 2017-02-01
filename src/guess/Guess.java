package guess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joshua Tennies
 */
public class Guess {

    /**
     * Loop through until user guesses correct number between 1 and 10.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(10) + 1;
        System.out.print("Guess a number between 1 and 10: ");
        while (true) {
            int guess = sc.nextInt();
            if (guess == answer) {
                break;
            } else if (guess > answer) {
                System.out.print("\nYour guess is too high. Guess again: ");
            } else {
                System.out.print("\nYour guess is too low. Guess again: ");
            }
        }
        System.out.println("Good job! You guessed the answer!");

    }

}
