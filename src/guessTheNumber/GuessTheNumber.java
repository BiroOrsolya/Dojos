package guessTheNumber;

import java.util.Scanner;

public class GuessTheNumber
{
	public static String randomNumber()
	{

		int randNum = (int) (Math.random() * 100);
		System.out.println("Please enter a number between 0 and 100!");
		int guess;
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		int count = 0;
		while (guess != randNum)
		{
			if (guess < randNum)
			{
				System.out.println("Your guess is lesser than the generated number!");
				guess = input.nextInt();
				count++;
			} else
			{
				System.out.println("Your guess is bigger than the generated number!");
				guess = input.nextInt();
				count++;

			}
		}

		return ("You find the number, well done! You guessed " + (count + 1) + " times.");

	}

	public static void main(String[] args)
	{
		System.out.println(randomNumber());
	}
}
