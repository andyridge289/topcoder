
import java.util.ArrayList;

public class PR13 
{

	public static void main(String[] args)
	{
		PR13 p = new PR13();
	}
	
	public PR13()
	{
		int[] bs = new int[] { 10, 3, 9, 26, 30 };

		for(int b : bs) {
			int[] ret = digits(b);

			System.out.print("{");
			for(int i = 0; i < ret.length - 1; i++)
				System.out.print(ret[i] + ",");
			System.out.println(ret[ret.length - 1] + "}");
		}
	}
	
	private int[] digits(int base)
	{
		ArrayList<Integer> interestingOnes = new ArrayList<Integer>();

		for(int i = 2; i < base; i++)
		{
			// These are all the numbers below the base
			int val = i;
			int ceiling = base * base * base;
			boolean interesting = true;

			while(val < ceiling) {

				// get digits
				int first = val % base;
				int second = (val / base) % base;
				int third = (val / (base * base)) % base;

				if((first + second + third) % i != 0) {
					interesting = false;
					break;
				}

				val += i;
			}

			if(interesting)
				interestingOnes.add(i);
		}

		int[] end = new int[interestingOnes.size()];
		for(int i = 0; i < interestingOnes.size(); i++)
			end[i] = interestingOnes.get(i);

		return end;
	}	
}