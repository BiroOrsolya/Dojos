package person;

import java.util.Comparator;

public class HeightComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2)
	{
		if (o1.height < o2.height)
		{
			return -1;
		}
		if (o1.height > o2.height)
		{
			return 1;
		}
		return 0;
	}

}
