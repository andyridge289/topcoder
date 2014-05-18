
public class PR08 
{

	public static void main(String[] args)
	{
		PR08 p = new PR08();
	}
	
	public PR08()
	{
		String in = "VQREQFGT";
		int step = 2;
		String o = decode(in, step);
		System.out.println(String.format("%s - %d: %s", in, step, o));
		
		in = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		step = 10;
		o = decode(in, step);
		System.out.println(String.format("%s - %d: %s", in, step, o));
		
		in = "TOPCODER";
		step = 0;
		o = decode(in, step);
		System.out.println(String.format("%s - %d: %s", in, step, o));
		
		in = "ZWBGLZ";
		step = 25;
		o = decode(in, step);
		System.out.println(String.format("%s - %d: %s", in, step, o));
	}
	
	private String decode(String cipherText, int shift)
	{
		String out = "";
		for(int i = 0; i < cipherText.length(); i++)
		{		
			int c = cipherText.charAt(i) - shift;
			
			if(c < 'A') {
				int diff = 'A' - c;
				c = 'Z' - diff + 1;
			}
			
			out += (char) c;
		}
		
		return out;
	}
}
