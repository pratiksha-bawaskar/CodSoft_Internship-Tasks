package Tasks;

import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
	
	    public static void main(String[] args) {
	        Random rand = new Random();
	        Scanner scanner = new Scanner(System.in);
	        int numberToGuess = rand.nextInt(100) + 1;
	        int guess;
	        int attempts = 0;

	        System.out.println("Guess the number between 1 and 100:");

	        do {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            attempts++;

	            if (guess < numberToGuess) {
	                System.out.println("Too low!");
	            } else if (guess > numberToGuess) {
	                System.out.println("Too high!");
	            } else {
	                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
	            }
	        } while (guess != numberToGuess);

	        scanner.close();
	    }
	}

