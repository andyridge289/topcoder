import java.util.ArrayList;


public class PR1 
{
		public static void main(String[] args)
		{
			PR1 pr1 = new PR1();
//			BinaryCode bc = pr1.new BinaryCode();
		}
		
	
		private class BinaryCode
		{
			public BinaryCode()
			{
				String[] tests = new String[] { "123210122", "11", "22111", "123210120", "3", "1222111222222111222111111112221111"}; 
						
				for(String test : tests)
				{
					String[] ret = decode(test);
						
					System.out.println("{" + ret[0] + ", " + ret[1] + "}");
				}
			}
			
			public String[] decode(String message)
			{
				String[] results = new String[]{ "0", "1" };
			
				results[0] += (char) ((message.charAt(0) - '0') - (results[0].charAt(0) - '0') + '0');
				results[1] += (char) ((message.charAt(0) - '0') - (results[1].charAt(0) - '0') + '0');
			
				boolean firstValid = true;
				boolean secondValid = true;
				
				for(int i = 2; i < message.length() ; i++)
				{
					
					if(firstValid)
					{
						char c = (char) ((message.charAt(i - 1) - '0') - 
								  (results[0].charAt(i - 2) - '0') - 
								  (results[0].charAt(i - 1) - '0') + '0');
						
						if(c == '0' || c == '1')
							results[0] += c;
						else
						{
							firstValid = false;
							results[0] = "NONE";
						}
					}
					
					if(secondValid)
					{
						char c = (char) ((message.charAt(i - 1) - '0') - 
								  (results[1].charAt(i - 2) - '0') - 
								  (results[1].charAt(i - 1) - '0') + '0');
						
						if(c >= '0' && c <= '3')
							results[1] += c;
						else
						{
							secondValid = false;
							results[1] = "NONE";
						}
					}

				}
				
				return results;
			}
		}
}
