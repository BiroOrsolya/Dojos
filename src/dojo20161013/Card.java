package dojo20161013;

public class Card implements Comparable<Card>
{
	private Suit suit;
	private Rank rank;

	Card(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit()
	{
		return suit;
	}

	public Rank getRank()
	{
		return rank;
	}

	@Override
	public String toString()
	{
		return rank.toString() + suit.toString();
	}

	@Override
	public int compareTo(Card card)
	{
		Rank[] ranks = Rank.values();
		Rank otherCardRank = card.getRank();
		int actualRankIdex = -1;
		int otherRankIndex = -1;
		for (int i = 0; i < ranks.length; i++)
		{
			if (ranks[i] == otherCardRank)
			{
				otherRankIndex = i;
			}
			if (ranks[i] == rank)
			{
				actualRankIdex = i;
			}
		}
		return actualRankIdex - otherRankIndex;

	}

}
