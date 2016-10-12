package longString;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter
{
	public static String[] split(String text, int rowLength)
	{
		String[] splitted = text.split(" ");
		List<String> result = new ArrayList<>();

		String row = "";

		for (String string : splitted)
		{
			if (string.length() + row.length() > rowLength)
			{
				result.add(row);
				row = string + " ";
			} else
			{
				row += string + " ";
			}
			result.add(string);
		}
		return (String[]) result.toArray(new String[result.size()]);
	}

	public static void main(String[] args)
	{
		String[] splitted = StringSplitter.split("My little pony is the best animated show ever", 4);
		for (String string : splitted)
		{
			System.out.println(string);
		}
	}
}