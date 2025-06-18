package ex_12_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab125_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // Random =>  1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // 0 to 100
//      System.out.println(numberToGuess);
        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }
        }
    }
}
