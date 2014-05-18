
public class PR10 
{

	public static void main(String[] args)
	{
		PR10 p = new PR10();
	}
	
	public PR10()
	{
		int[] numbers = new int[] {
			12345,
			661232,
			52527,
			730000000
		};
		
		for(int number : numbers) {
			int n = howMany(number);
			System.out.println(String.format("%d: %d", number, n));
		}
	}
	
	public int howMany(int number)
	{
		String strNumber = "" + number;
		
		int count = 0;
		for(int i = 0; i < strNumber.length(); i++) {
			int c = strNumber.charAt(i) - '0';
			
			if(c == 0)
				continue;
			
			if(number % c == 0)
				count++;
		}
		
		return count;
	}
}