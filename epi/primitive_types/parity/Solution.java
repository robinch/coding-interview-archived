public class Solution{

		/**
		* Returns the parity of a 64-bit number (long)
		* Returns 1 of nr of 1's in the number is odd
		* Else it returns 0
		*/
		public static int parity(long x){
			// will shift and use XOR

			int parity = 0;
			while (x != 0) {
					parity ^= (x & 1);
					x = x >>> 1;
			}
			return parity;
		}
}