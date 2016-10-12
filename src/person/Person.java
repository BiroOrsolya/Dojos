package person;

public class Person implements Comparable<Person>
{

	String name;
	int age;
	double height; // m
	Sex sex;

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", sex=" + sex + "]";
	}

	Person(String name, int age, double height, Sex sex)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public Sex getSex()
	{
		return sex;
	}

	public void setSex(Sex sex)
	{
		this.sex = sex;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public int compareTo(Person o)
	{
		return name.compareTo(o.getName());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Person)
		{
			return ((Person) obj).getAge() == age;

		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return 0;
	}

}
