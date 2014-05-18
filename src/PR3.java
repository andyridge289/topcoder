
public class PR3 
{
	public static void main(String[] args)
	{
		PR3 pr3 = new PR3();	
	}
	
	public PR3()
	{
		int[][] tests = new int[][]{
				{
					1,2,3,4,5
				}
		};
		
		for(int[] test : tests)
		{
			int[] ret = getDivision(test);
			System.out.print("{");
			for(int r : ret)
				System.out.print(r + ", ");
			System.out.print("}");
			System.out.println();
		}
	}
	
	// Add all the points to get total
	// Work out the percentage that each employee got (floored)
	// Store the remainder and deal with it later
	public int[] getDivision(int[] points)
	{
		int total = 0;
		for(int i : points)
			total += i;
		System.out.println(total);
		
		int[] bonuses = new int[points.length];
		double r = 0;
		
		for(int i = 0; i < points.length; i++)
		{
			double pc = (double) points[i] / (double) total * 100;
			bonuses[i] = (int) Math.floor(pc);
			r += (pc - bonuses[i]);
		}
		
		// Add the results of the remainder to the thing
		
		
		return bonuses;
	}
}
