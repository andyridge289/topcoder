import java.util.Collections;


public class PR06 
{

	public static void main(String[] args)
	{
		PR06 pr6 = new PR06();
	}
	
	public PR06()
	{
		int p = maxPoints(new int[]{ 2, 2, 3, 5, 4});
		System.out.println(String.format("(%d,%d,%d,%d,%d) = %d", 2, 2, 3, 5, 4, p));
		
		p = maxPoints(new int[]{ 6, 5, 1, 1, 3});
		System.out.println(String.format("(%d,%d,%d,%d,%d) = %d", 6, 4, 1, 1, 3, p));
		
		p = maxPoints(new int[]{ 5, 3, 5, 3, 3});
		System.out.println(String.format("(%d,%d,%d,%d,%d) = %d", 5, 3, 5, 3, 3, p));
	}
	
	public int maxPoints(int[] toss)
	{
		int[] scores = new int[6];
		
		for(int i = 0; i < toss.length; i++) {
			
			scores[toss[i] - 1]++;
		}
		
		int max = scores[0];
		
		for(int i = 1; i < scores.length; i++) {
		
			if(max < scores[i] * (i + 1))
			{
				max = scores[i] * (i + 1);
			}
		}
		
		return max;
	}
}
