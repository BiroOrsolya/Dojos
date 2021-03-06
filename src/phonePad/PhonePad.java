package phonePad;

import java.util.HashMap;

public class PhonePad
{
	/*------- ------- -------
	|     | | ABC | | DEF |
	|  1  | |  2  | |  3  |
	------- ------- -------
	------- ------- -------
	| GHI | | JKL | | MNO |
	|  4  | |  5  | |  6  |
	------- ------- -------
	------- ------- -------
	|PQRS | | TUV | | WXYZ|
	|  7  | |  8  | |  9  |
	------- ------- -------
	------- ------- -------
	|     | |space| |     |
	|  *  | |  0  | |  #  |
	------- ------- -------
	*/

	private final static HashMap<Integer, char[]> keypad = new HashMap<>();

	static
	{
		keypad.put(2, new char[] { 'A', 'B', 'C' });
		keypad.put(3, new char[] { 'D', 'E', 'F' });
		keypad.put(4, new char[] { 'G', 'H', 'I' });
		keypad.put(5, new char[] { 'J', 'K', 'L' });
		keypad.put(6, new char[] { 'M', 'N', 'O' });
		keypad.put(7, new char[] { 'P', 'Q', 'R', 'S' });
		keypad.put(8, new char[] { 'T', 'U', 'V' });
		keypad.put(9, new char[] { 'W', 'X', 'Y', 'Z' });
		keypad.put(0, new char[] { ' ' });
	}

	public String keypadReader(String input)
	{
		String result = "";

		Character previousChar = null;
		int arrayIndex = 0;
		Character charToAppend = null;

		for (int i = 0; i < input.length(); i++)
		{
			char currentChar = input.charAt(i);
			int keypadNum = Character.getNumericValue(currentChar);
			char[] currentValues = keypad.get(keypadNum);

			if (previousChar == null)
			{
				charToAppend = currentValues[0];
				previousChar = currentChar;
			} else if (previousChar == currentChar)
			{
				arrayIndex = (arrayIndex + 1) % currentValues.length;
				charToAppend = currentValues[arrayIndex];
			} else
			{
				arrayIndex = 0;
				result += String.valueOf(charToAppend);
				if (keypadNum == 1)
				{
					charToAppend = null;

				} else
				{
					charToAppend = currentValues[arrayIndex];
				}
				previousChar = currentChar;
			}
			if (i == input.length() - 1)
			{
				result += String.valueOf(charToAppend);
			}
		}

		return result;
	}

	public static void main(String[] args)
	{
		PhonePad pp = new PhonePad();
		System.out.println(pp.keypadReader("02221224567")); // "BGJMP"
	}
}
