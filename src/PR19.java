import java.lang.Math;

public class PR19
{
	public static void main(String[] args) {

		PR19 pr = new PR19();

		int[][] sales = new int[][]{
			{ 5 },
			{ 75, 120, 0, 93 },
			{ 8773 },
			{ 1115, 7264, 3206, 6868, 7301 }
		};

		int[][] days = new int[][]{
			{ 15 },
			{ 24, 30, 0, 30 },
			{ 16 },
			{ 1, 3, 9, 4, 18 }
		};

		for(int i = 0; i < sales.length; i++) {
			int order = pr.monthlyOrder(sales[i], days[i]);

			System.out.print("{");
			for(int s : sales[i])
				System.out.print(" " + s);
			System.out.print( "}  {");
			for(int d : days[i]) {
				System.out.print(" " + d);
			}
			System.out.println(" } = " + order);
		}

	}

	public int monthlyOrder(int[] sales, int[] daysAvailable) {

		// keep track of the running total, and the number of non-zero months

		// for each
		   // if days available is zero then continue
		   // Get the average for the days available
		   // divide by days available to get the 1 day average
		   // multiply by 30 to get the monthly average

		  double total = 0;
		  double months = 0;

		  for(int i = 0; i < sales.length; i++) {

		    if(daysAvailable[i] == 0)
		      continue;

		    double avg = sales[i] / (double) daysAvailable[i];

		    total += avg * 30;
		    months++;
		  }

		  return (int) Math.ceil(total / months);
		}

}