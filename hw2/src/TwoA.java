public class TwoA {

	public static boolean isMultiple(long a, long b) {
		if (b==0)
			return false;
		return (0 == (a % b));
	}

	public static boolean isOdd(int i) {
		return (Math.abs(java.lang.Math.IEEEremainder(Math.abs((double)(int)i), 2)) == 1);
	}

	public static int oddSumTo(int n) {
		int j = 0;
		for (int i = 1; i < n; i = i + 2) {
			j = i + j;
		}
		return j;
	}

	public static boolean isOddProd(int[] n) {
		int counter = 0;
		for (int i = 0; i < n.length; i++) {
			if (isOdd(n[i]))
				counter++;
			if (counter == 2)
				return true;
		}
		return false;

	}

	public static boolean allDistinct(int[] n) {
		int length = n.length;
		// http://stackoverflow.com/a/4869140
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (n[i] == n[j])
					return false;
			}
		}
		return true;
	}

	public static int[] reverseInts(int[] n) {
		int[] temp = new int[n.length];
		for (int x = 0; x < n.length; x++) {
			temp[x] = n[(n.length-1) -x];
		}
		for (int x=0; x<n.length; x++)
		{
			n[x]=temp[x];
		}
		//I'm only doing this second for loop because you said to "reverse their order in the same array".
		//I had written the first for loop before hand and this was the quickest way to revise it to spec
		return n;
	}
    public static int average(long left, long right) {
        return (int)((left+right) / 2);
    }

}