
public class PR15 
{

	public static void main(String[] args)
	{
		PR15 p = new PR15();
	}
	
	public PR15()
	{
		int[] sides = new int[]{
			3
		};

		for(int i = 0; i < sides.length; i++) {
			double ret = approximatePi(sides[i]);
			System.out.println(sides[i] + ": " + ret);
		}
	}

	private double approximatePi(int numSides)
	{
		double pi = pCircle /  (2 * radius)
		double pN = numSides * length;


		return 0.0;
	}
}