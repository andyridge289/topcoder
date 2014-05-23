
public class PR12 
{

	public static void main(String[] args)
	{
		PR12 p = new PR12();
	}
	
	public PR12()
	{
		int d = 123456;
		int c = 0;
		String ret = amount(d, c);
		System.out.println(String.format("%d,%d : %s", d, c, ret));

		d = 49734321;
		c = 9;
		ret = amount(d, c);
		System.out.println(String.format("%d,%d : %s", d, c, ret));


		d = 0;
		c = 99;
		ret = amount(d, c);
		System.out.println(String.format("%d,%d : %s", d, c, ret));

		d = 249;
		c = 30;
		ret = amount(d, c);
		System.out.println(String.format("%d,%d : %s", d, c, ret));

		d = 1000;
		c = 1;
		ret = amount(d, c);
		System.out.println(String.format("%d,%d : %s", d, c, ret));
	}
	
	private String amount(int dollars, int cents)
	{
		String centString = cents < 10 ? "0" + cents : "" + cents;
		if(dollars == 0)
			return "$0." + cents;

		String dollarString = "";

		while(dollars / 1000 >= 1)
		{
			String dMod = "" + (dollars % 1000);
			while(dMod.length() < 3)
				dMod = "0" + dMod;

			dollarString = "," + dMod + dollarString;
			
			dollars /= 1000;
		}

		return "$" + dollars + dollarString + "." + centString;
	}
	
}