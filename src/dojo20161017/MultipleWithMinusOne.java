package dojo20161017;

import java.util.Arrays;

public class MultipleWithMinusOne
{

	public static int[][] multiple(int[][] field)
	{
		for (int i = 0; i < field.length; i++)
		{
			if (i % 2 != 0)
			{

				for (int j = 0; j < field[i].length; j++)
				{
					field[i][j] = field[i][j] * -1;
				}
			}
		}
		for (int i = 0; i < field.length; i++)
		{
			for (int j = 0; j < field[i].length; j++)
			{
				if (j % 2 != 0)
				{
					field[i][j] = field[i][j] * -1;
				}
			}
		}
		return field;
	}

	public static void main(String[] args)
	{
		int[][] field = new int[][] { { 2, 4, 8, 3 }, { -5, 6, 7, 9, 1, -8 }, { 10 }, { 11, 2, 7 }, { 12, 20, -1 },
				{ 1, 2, 4 } };

		for (int[] ar : multiple(field))
		{
			System.out.println(Arrays.toString(ar));
		}
	}
}
