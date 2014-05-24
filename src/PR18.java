public class PR18
{
	public static void main(String[] args) {
		PR18 pr = new PR18();
		pr.cycleRange(0.1);
	}



	  public double cycleRange(double R) {
	   
	    double x = 0.25;
	    for(int i = 0; i < 200000; i++) {
	      x = R * x * (1 - x);
	    }

	    x = R * x * (1 - x);
	    double min = x;
	    double max = x;

	    for(int i = 0; i < 999; i++) {
	      x = R * x * (1 - x);    

		  if(x < min)
	        x = min;

	      if(x > max)
	        x = max;
	    }

	    return max - min;
	}



}

