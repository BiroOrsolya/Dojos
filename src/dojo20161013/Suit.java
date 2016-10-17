package dojo20161013;

public enum Suit
{
	HEART('h'), DIAMOND('d'), CLUB('c'), SPADE('s');

	private char value;

	private Suit(char value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return String.valueOf(value);
	}

}
