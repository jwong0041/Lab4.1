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
	public Cards deal()
	{
		Cards r = unDealt.remove(0);
		Dealt.add(r);
		return r;
	}
	
	//shuffling randomly from last spot
	public void shuffleRandom()
	{
			int k = unDealt.size();
			
			for(int y = k - 1; y >= 0; y--)
			{
				int r = (int)(Math.random()*(k-1));
				
				Cards temp = unDealt.get(y);
				unDealt.set(y, unDealt.get(r));
				unDealt.set(r, temp);
			}
	}
	
	//shuffling based on the largest value
	public void shuffleBig()
	{
		int k = unDealt.size();
		int bigInd = 0;
		
		for(int y = k - 1; y >= 0; y--)
		{
			for ( int x = 0; x < k; x++)
			{
				if(unDealt.get(x).getValue() < unDealt.get(bigInd).getValue())
				{
					bigInd = x;
				}
			}
			
			Cards temp = unDealt.get(y);
			unDealt.set(y, unDealt.get(bigInd));
			unDealt.set(bigInd, temp);
			
		}
	}
	
}
