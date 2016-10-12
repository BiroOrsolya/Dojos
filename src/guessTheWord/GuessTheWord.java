package guessTheWord;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord
{
	static String[] wordList = new String[] { "codecool", "pony", "telephone", "house" };

	public static String getRandom(String[] wordList)
	{
		Random generator = new Random();
		int randomIndex = generator.nextInt(wordList.length);
		return wordList[randomIndex];
	}

	public static String guess(String guess)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("The word contains " + getRandom(wordList).length() + " characters.");
		guess = userInput.next();
		while (guess != getRandom(wordList))
		{
			return "nope";
		}
		return "You guessed the word";
	}

	public static void main(String[] args)
	{
		System.out.println(guess(null));
	}
}
