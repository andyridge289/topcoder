
public class PR09 
{

	public static void main(String[] args)
	{
		PR09 p = new PR09();
	}
	
	public PR09()
	{
		String[] decks = new String[] {
			"1234",
			"KKKKKKKKKK",
			"KKKKKAQT23",
			"KKKKATQ23J",
			"AT68482AK6875QJ5K9573Q",
			"AQK262362TKKAQ6262437892KTTJA332"
		};
		
		for(String deck : decks) {
			int o = cardsLeft(deck);
			System.out.println(String.format("%s - %d", deck, o));
//			break;
		}
	}
	
	private int cardsLeft(String deck)
	{
		int[] values = new int[14]; 
			
		for(int i = 0; i < deck.length();){
			
			if(deck.charAt(i) == 'K')
				deck = deck.substring(0, i) + deck.substring(i + 1);
			else
				i++;
		}
		
		int numRemoved = -1;
		while(deck.length() > 0 && numRemoved != 0)
		{
			numRemoved = 0;
			
			for(int i = 0; i < deck.length(); i++)
			{
				boolean wrap = true;
				int first = getValue(deck.charAt(i));
				int second = getValue(deck.charAt(0));
				
				if(i < deck.length() - 1) {
					second = getValue(deck.charAt(i + 1));
					wrap = false;
				}
				
				if(first + second == 13)
				{
					if(i == deck.length() - 2)
						deck = deck.substring(0, i);
					else {
						
						
						if(!wrap)
							deck = deck.substring(0, i) + deck.substring(i + 2);
						else
							deck = deck.substring(1, i);
					}
					numRemoved++;
				}
			}
		}
	
		return deck.length();
	}
	
	private int getValue(char c)
	{
		int value = 0;
		
		switch(c)
		{
		case 'A':
			value = 1;
			break;
		case 'T':
			value = 10;
			break;
		case 'J':
			value = 11;
			break;
		case 'Q':
			value = 12;
			break;
		case 'K':
			value = 13;
			break;
		default:
			value = c - '0';
		}
		
		return value;
	}
	
}
