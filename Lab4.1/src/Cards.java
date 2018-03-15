public class Cards 
{
	//fields
	private String rank;
	private String suit;
	private int value;

	//Getters n' Setters
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	//constructor
	public Cards(String rank, String suit, int value) 
	{
		// TODO Auto-generated constructor stub
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	
	//check to see if otherCard is equal to Card
	public boolean equals(Cards otherCard)
	{
		if (otherCard.getValue() == this.value)
		{
			return true;
		}
		return false;
	}
	
	//make card printable. 
	public String toString()
	{
		return this.rank + " of " + this.suit + ", current value: " + this.value;
	}
}
