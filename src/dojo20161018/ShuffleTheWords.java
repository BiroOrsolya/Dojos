package dojo20161018;

import java.util.Random;

public class ShuffleTheWords
{
	public static String shuffle(String input)
	{

		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words)
		{
			if (word.length() > 3)
			{
				char first = word.charAt(0);
				char last = word.charAt(word.length() - 1);
				word = shuffleWord(word.substring(1, word.length() - 1));
				word = first + word + last;

			}
			result.append(word);
			result.append(" ");

		}
		return result.toString();
	}

	public static String shuffleWord(String word)
	{
		Random rand = new Random();
		String result = word;
		for (int i = 0; i < result.length(); i++)
		{
			result = swapChars(result, i, rand.nextInt(result.length()));
		}
		return result;
	}

	public static String swapChars(String word, int i, int j)
	{
		if (i == j)
		{
			return word;
		}
		String result = null;
		char[] chars = word.toCharArray();
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;

		result = new String(chars);
		// i, j = j, i; (python value swap)

		return result;
	}

	public static void main(String[] args)
	{
		String text = "Trump szerint nem jó hogy Obama és Clinton folyamatosan sértegetik az orosz elnököt.";
		// String text = "A polgármester nevelt fia és egy önkormányzati
		// képviselõ is benne volt a buliban.";
		System.out.println(shuffle(text));
	}
}
