package tirangle;

import java.util.Arrays;

public class TriangleArray
{
	public static final String TEXT = "Hello";

	public static char[][] toTriangleArray(String text)
	{
		String reversed = new StringBuilder(text).reverse().toString();
		char[] charArray = reversed.toCharArray();
		for (int i = charArray.length; i >= 0; i--)
		{
			System.out.println(reversed.substring(0, i));

		}
		return null;
	}

	public static void main(String[] args)
	{
		char[][] caTriangle = toTriangleArray(TEXT);
		for (char[] cs : caTriangle)
		{
			System.out.println(Arrays.toString(cs));
		}
		/*
		 * [o] [o, l] [o, l, l] [o, l, l, e] [o, l, l, e, H] [o, l, l, e] [o, l,
		 * l] [o, l] [o]
		 */
	}
}
