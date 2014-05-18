public class PR2 
{
		public static void main(String[] args)
		{
			PR2 pr2 = new PR2();
		}
	
		public PR2()
		{
			int [] tests = new int[]{ 0, 3661, 5436, 86399 };
			for(int test: tests)
				System.out.println(whatTime(test));
		}

		
		public String whatTime(int seconds)
		{
			if(seconds > 86399)
				return "You fail";
			
			int hours = seconds / 3600;
			seconds -= hours * 3600;
			
			int minutes = seconds /60;
			seconds -= minutes * 60;
			
			return hours + ":" + minutes + ":" + seconds;
			
		}

}
