public class Solution {

	//Swap bits in bit position i and j in x
	public static long swapBits(long x, int i, int j) {
		/*
			The though is to only swap if bit at i and j are different
			Then I just need to change their bit value
		*/

		if(((x >>> i) & 1) != ((x >>> j ) & 1)) {
			x ^= ((1L << i) | (1L << j));
		}
		return x;
	}
}