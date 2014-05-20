
public class PR11 
{

	public static void main(String[] args)
	{
		PR11 p = new PR11();
	}
	
	public PR11()
	{
		int[][] arrivals = new int[][] {
				{ 3, 3, 9},
				{182},
				{ 2, 10, 11},
				{ 2, 10, 12}
		};
		
		int[][] sequences = new int[][] {
				{ 2, 15, 14 },
				{ 11},
				{ 3, 4, 3},
				{ 15, 1, 15}
		};
		
		for(int i = 0; i < arrivals.length; i++) {
			int n = maxWait(arrivals[i], sequences[i]);
			
			String arrivalString = "";
			for(int a : arrivals[i])
				arrivalString += " " + a;
			
			String sequenceString = "";
			for(int a : sequences[i])
				sequenceString += " " + a;
			
			System.out.println(String.format("{%s }, {%s }: %d", arrivalString, sequenceString, n));
		}
	}
	
	private int maxWait(int[] arrival, int[] sequence)
	{
		int priorLeft = 0;
		int[] waits = new int[arrival.length];
		int max = 0;
		
		for(int i = 0; i < arrival.length; i++)
		{
			int orderWait = priorLeft - arrival[i] > 0 ? priorLeft - arrival[i] : 0;
			int totalWait = orderWait + sequence[i];
			
			priorLeft = arrival[i] + totalWait;
			waits[i] = orderWait;
			
			if(max < waits[i])
				max = waits[i];
		}
		
		return max;
	}
	
}