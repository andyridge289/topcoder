
public class PR5 
{

	public static void main(String[] args)
	{
		PR5 pr5 = new PR5();
	}
	
	public PR5()
	{
		long a = countRectanges(3, 3);
		System.out.println(String.format("%d x %d = %d", 3, 3, a));
		a = countRectanges(5, 2);
		System.out.println(String.format("%d x %d = %d", 5, 2, a));
		a = countRectanges(10, 10);
		System.out.println(String.format("%d x %d = %d", 10, 10, a));
		
	}
	
	// this works but is horrifically inefficient
	public long countRectanges(int width, int height)
	{
		long count = 0;
		
		for(int i = width; i > 0; i--)
		{
			for(int j = height; j > 0; j--)
			{
				if(i == j) continue;
				
				int iPos = 0;
				int sCount = 0;
				
				while(iPos + i <= width) {
					
					int jPos = 0;
					
					while(jPos + j <= height){
						
						sCount++;
						
						jPos++;
					}	
					
					iPos++;
				}
				
				count += sCount;
			}
		}
		
		return count;
	}
}
