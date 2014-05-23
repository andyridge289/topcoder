import java.util.HashMap;

public class PR16
{
	public static void main(String[] args) {
		PR16 pc = new PR16();

		String[][] results = new String[][] {
			{ "trivial" },
			{ "10001", "011", "100", "001", "10" },
			{ "no", "nosy", "neighbors", "needed" },
			{ "1010", "11", "100", "0", "1011" },
			{ "No", "not" }
		};

		for(String[] ss : results) {
			String t = pc.isOne(ss);
			String u = pc.isOneTwo(ss);

			System.out.print("{");
			for(String s : ss)
				System.out.print(" " + s);
			System.out.println("} = " + t + ",  " + u);
		}
	}

public String isOne(String[] words)
{
	int lowestIndex = -1;
	int lowestCount = -1;

	for(int i = 0; i < words.length; i++) {
		for(int j = i + 1; j < words.length; j++) {

			String wordA = words[i];
			String wordB = words[j];

			int minLen = Math.min(wordA.length(), wordB.length());
			int sameIndex = -1;
			for(int k = 0; k < minLen; k++) {

				if(wordA.charAt(k) == wordB.charAt(k))
					sameIndex = k;
				else
					break;
			}

			if(sameIndex == wordA.length() - 1 && (lowestCount == -1 || lowestCount < sameIndex)) {
				lowestCount = sameIndex;
				lowestIndex = i;
				
			} else if(sameIndex == wordB.length() -1  && (lowestCount == -1 || lowestCount < sameIndex)) {
				lowestCount = sameIndex;
				lowestIndex = j;

			} 
		}
	}

	if(lowestIndex == -1)
		return "Yes";
	else
		return "No, " + lowestIndex;
}

public String isOneTwo(String[] words)
{
	HashMap<String, String> prefixes = new HashMap<String, String>();

	for(String w : words)
		for(int i = 1; i < w.length(); i++)
			prefixes.put(w.substring(0, i), w);

	int retIndex = -1;

	for(int i = 0; i < words.length; i++) {
		String s = prefixes.get(words[i]);
		if(s == null)
			continue;

		retIndex = i;
		break;
	}

	if(retIndex == -1)
		return "Yes";
	else
		return "No, " + retIndex;
}

}

