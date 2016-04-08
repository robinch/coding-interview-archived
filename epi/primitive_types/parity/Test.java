public class Test{

	public static void main(String[] args) {


		long[] tests = new long[2];

		// 2 ones => parity 0
		tests[0] = 0b101;

		// 19 ones => parity 1
		tests[1] = 0b11101101100101011011010010110110L;

		
		String binary;
		for(int i = 0; i < tests.length; i++) {

			binary = Long.toBinaryString(tests[i]);

			System.out.format("Parity of %d, binary = %s: My answer = %d, Correct = %d\n", 
			tests[i], 
			binary,
			Solution.parity(tests[i]),
			(binary.length() - binary.replaceAll("1", "").length()) % 2
			);
		}
	}
}