

public class PR17
{
	public static void main(String[] args) {
		PR17 pc = new PR17();

		int[] positions = new int[] {
			3, 1, 1, 5
		};

		int[] friends = new int[] {
			6, 1, 2, 11
		};

		int[] picks = new int[] {
			15, 10, 39, 100
		};

		for(int i = 0; i < positions.length; i++) {

			int[] ret = pc.returnPicks(positions[i], friends[i], picks[i]);
			System.out.print(String.format("{%d,%d,%d}: ", positions[i], friends[i], picks[i]));
			
			for(int in : ret) {

				System.out.print(in + "  ");
			}
			System.out.println();
		}
	}

	private int[] returnPicks(int position, int friends, int picks) {

		int even = position;
		int odd = friends - position + 1;
		int[] results = new int[picks/friends];
		int index = 0;

		for(int i = 0; i < picks; i += friends)
		{
			if(index % 2 == 0)
				results[index] = i + even;
			else
				results[index] = i + odd;

			index++;
		}

		return results;
	}



}

