import java.lang.Math;

public class PR20
{
	public static void main(String[] args) {

		PR20 pr = new PR20();

		int[][] costs = new int[][]{
			{ 100, 120, 150, 1000 },
			{ 100 },
			{38,24}
		};

		int[][] prices = new int[][]{
			{ 110, 110, 200, 2000 },
			{100},
			{37,23}
		};

		int[][] sales = new int[][]{
			{ 20, 100, 50, 3 },
			{134},
			{1000,643}
		};

		String[][] items = new String[][] {
			{ "Video card", "256mb memory", "CPU/mobo", "Complete machine" },
			{ "Service, at a cost"},
			{ "Letter", "post card"}
		};

		for(int i = 0; i < costs.length; i++) {
	
			String item = pr.bestItem(costs[i], prices[i], sales[i], items[i]);
			System.out.println(item);
		}
			
	}

	public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
	  int maxProfit = 0;
	  int index = -1;

	  for (int i = 0; i < costs.length; i++) {
	    int profit = (prices[i] - costs[i]) * sales[i];
	    if(profit > 0 && profit > maxProfit) {
	      maxProfit = profit;
	      index = i;
	    }
	  }

	  if(index == -1)
	    return "";
	  else
	    return items[index];
	}	

}