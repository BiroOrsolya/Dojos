package intArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArray
{
	public static int[] generate(int n)
	{
		int[] randomNumbersList = new int[n];
		for (int i = 0; i < randomNumbersList.length; i++)
		{
			randomNumbersList[i] = (int) (Math.random() * 20);
		}
		return randomNumbersList;
	}

	public static Integer[][] subArrays(int[] randomNumbersList)
	{
		List<Integer[]> resultList = new ArrayList<Integer[]>();
		List<Integer> subList = new ArrayList<Integer>();
		for (int i : randomNumbersList)
		{
			if (!subList.contains(i))
			{
				subList.add(i);
			} else
			{
				Integer[] subArray = subList.toArray(new Integer[1]);
				resultList.add(subArray);
				subList.clear();
				subList.add(i);
			}
		}

		Integer[] subArray = subList.toArray(new Integer[1]);
		resultList.add(subArray);
		return resultList.toArray(new Integer[1][]);

	}

	public static void main(String[] args)
	{
		int[] randoms = generate(25);
		System.out.println(Arrays.toString(randoms));
		System.out.println();
		Integer[][] splitted = subArrays(randoms);
		for (Integer[] is : splitted)
		{
			System.out.println(Arrays.toString(is));
		}
	}

}
