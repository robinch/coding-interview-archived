public class Solution {
	public static long closestNumberSameWeight(long x) {
		/*
			The idea start at the least significant bit
			and walk towards the most significant bit
			and swap the first two bits that are next to
			each others that are different

			This won't change the weight of the bit
			and will also make the least change to the value

			we will not travel travel to the most significant bit
			because that's  the sign bit

			Long 64-bit so we will travel to the bit with index 62 at most
		*/

			final int BITS_TO_TRAVEL = 63;

			for(int i = 0; i < BITS_TO_TRAVEL - 1; i++ ) {
				if( ((x >>> i) & 1) != ((x >>> (i + 1)) & 1) ){
					x ^= (1 << i) | (1 << (i + 1));
					return x;				}
			}


			// no such number (only 1's or 0's excluding the sign bit)
			// Should maybe throw an exception here instead;
			return -1;

	}
}