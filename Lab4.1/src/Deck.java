import java.util.ArrayList;

public class Deck 
{
	//fields, do they need to be public/private? or is this alright?
	ArrayList<Cards> unDealt;
	ArrayList<Cards> Dealt;
	
	//Constructor
	public Deck(String[] rank, String[] suit, int[] value)
	{
		for(int i = 0; i<rank.length; i++)
		{
			for(int j = 0; j<suit.length; j++)
			{
				unDealt.add(new Cards(rank[i], suit[j], value[i]));
			}
		}
	}
	
	//checking to see if the undealt deck is empty, just like my wallet
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	//size of the deck ;)))
	public int size()
	{
		return this.unDealt.size();
	}
	
	//dealing cards [move from undealt to dealt, return Card]
	public String deal()
	{
		Cards r = unDealt.remove(0);
		Dealt.add(r);
		return r.toString();
	}
	
	
}
