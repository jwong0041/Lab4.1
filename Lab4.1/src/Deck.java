import java.util.ArrayList;

public class Deck 
{
	ArrayList <Card> unDealt;
	public Deck(String[] rank, String[] suit, String[] value)
	{
		for(int i = 0; i<rank.length; i++)
		{
			for(int j = 0; j<suit.length; j++)
			{
				unDealt.add(new Card(rank[i], suit[j], value[i]));
			}
		}
	}
}
