
public class PR14 
{

	public static void main(String[] args)
	{
		PR14 p = new PR14();
	}
	
	public PR14()
	{
		int[][] arrivalsList = new int[][] {
			{ 10, 0, 0, 4, 20 },
			{ 0, 0, 0 },
			{ 100, 100 },
			{ 27, 0, 0, 0, 0, 9 },
			{ 6, 5, 4, 3, 2, 1, 0, 0, 1, 2, 3, 4, 5, 6 }
		};
		int [] numPerDayList = new int[] {
			8, 
			10,
			10,
			9, 
			3
		};

		for(int i = 0; i < arrivalsList.length; i++) {

			int ret = days(arrivalsList[i], numPerDayList[i]);

			System.out.print("{");
			for(int a : arrivalsList[i])
				System.out.print(a + " ");
			System.out.println("}, " + numPerDayList[i] + ": " + ret + " \n");
		}

	}
	
	private int days(int[] arrivals, int numPerDay)
	{
		int dayStart = 0;
		int daysActive = 0;
		for(int i = 0; i < arrivals.length; i++)
		{
			int today = dayStart + arrivals[i];
			int remainder = today - numPerDay;

			if(today > 0)
				daysActive++;

			dayStart = remainder > 0 ? remainder : 0;
		}

		while(dayStart > 0) {
			daysActive++;
			dayStart -= numPerDay;
		}

		return daysActive;
	}
}