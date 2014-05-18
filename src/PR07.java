
public class PR07 
{

	public static void main(String[] args)
	{
		PR07 p = new PR07();
	}
	
	public PR07()
	{
		String o = order(5, 3, 2);
		System.out.println(String.format("[%d,%d,%d] = %s", 5, 3, 2, o));
		
		o = order(7, 3, 1);
		System.out.println(String.format("[%d,%d,%d] = %s", 7, 3, 1, o));
	}
	
	String order(int numMales, int numFemales, int k)
	{
		String output = "";
		for(int i = 0; i < numMales; i++)
			output += "M";
		
		int count = 1;
		while(numFemales > 0)
		{
			int index = k * count - 1;
			
			String pref = output.substring(0, index);
			String suff = output.substring(index);
			
			output = pref + "F" + suff;
			
			numFemales--;
			count++;
		}
		
		return output;
	}
}
