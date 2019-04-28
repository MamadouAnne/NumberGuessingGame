import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random ran = new Random();
		// Generates a number between 0 - 50
		int guess = ran.nextInt(51);

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your guess (0-50)");

		int[] guessNumbers = new int[50];

		int input = -1;
		int count = 0;

		while (input != guess) {

			// The code below will wait for the user to type an int
			input = scn.nextInt();

			// Storing their guessed numbers in the guessNumbers array
			guessNumbers[count] = input;

			count++;

			if (input < guess) {
				System.out.println("too low");
			} else if (input > guess) {
				System.out.println("too high");
			} else {
				System.out.println("you got it");
			}

		}

		System.out.println("thanks for playing, it took you " + count
				+ " tries");

		System.out.println("Your guessed numbers were: ");

		for (int i = 0; i < count; i++) {
			System.out.println(guessNumbers[i]);
		}
		
		scn.close();

	}
}
