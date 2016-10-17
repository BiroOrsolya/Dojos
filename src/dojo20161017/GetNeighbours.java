package dojo20161017;

import java.util.ArrayList;
import java.util.List;

public class GetNeighbours
{
	public static Integer[][] field = new Integer[][] { { 2, 4, 8, 3 }, { -5, 6, 7, 9, 1, -8 }, { 10 }, { 11, 2, 7 },
			{ 12, 20, -1 }, { 1, 2, 4 } };

	public static Integer[][] D = new Integer[][] { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 },
			{ 1, 0 }, { 1, 1 } };

	public static Integer[] getNeighbours(int i, int j)
	{
		List<Integer[]> resultList = new ArrayList<Integer[]>();
		for (Integer[] dir : D)
		{
			int di = i + dir[0];
			int dj = j + dir[1];
			if (di >= 0 && di < field.length && dj >= 0 && dj < field[di].length)
			{
				resultList.add(field[di][dj].intValue(), dir);

			}
		}
		return resultList.toArray(new Integer[1]);
	}

	public static void main(String[] args)
	{
		System.out.println(getNeighbours(4, 1));
	}
}
