package person;

import java.util.HashMap;
import java.util.Map;

public class Test
{
	public static void main(String[] args)
	{
		Person orsi = new Person("Orsi", 26, 1.71, Sex.FEMALE);
		Person milan = new Person("Milan", 24, 1.87, Sex.MALE);
		Person krisztian = new Person("Krisztian", 23, 1.6, Sex.MALE);
		Person balazs = new Person("Balazs", 28, 1.7, Sex.MALE);
		Person pista = new Person("Pista", 28, 1.4, Sex.MALE);

		Map<Person, Integer> personMap = new HashMap<>();
		personMap.put(orsi, 1);
		personMap.put(milan, 2);
		personMap.put(krisztian, 3);
		personMap.put(balazs, 4);

		System.out.println(personMap.get(pista));

		for (Person person : personMap.keySet())
		{
			System.out.println(person);
		}

		// Set<Person> personSet = new HashSet<Person>();
		// personSet.add(orsi);
		// personSet.add(milan);
		// personSet.add(krisztian);
		// personSet.add(balazs);
		// personSet.add(pista);
		//
		// for (Person person : personSet)
		// {
		// System.out.println(person);
		// }
		//
		// System.out.println(personSet.contains(pista));

		// List<Person> personList = new ArrayList<>();
		// personList.add(orsi);
		// personList.add(pista);
		// personList.add(milan);
		// personList.add(krisztian);
		// personList.add(balazs);
		//
		// System.out.println(personList.indexOf(balazs));
		// System.out.println(personList.indexOf(pista));
		//
		// // personList.sort(new HeightComparator());
		//
		// // personList.sort(new Comparator<Person>()
		// // {
		// // @Override
		// // public int compare(Person o1, Person o2)
		// // {
		// // return o1.getAge() - o2.getAge();
		// // }
		// // });
		//
		// // Collections.sort(personList);
		//
		// for (Person person : personList)
		// {
		// System.out.println(person.toString());
	}

}
