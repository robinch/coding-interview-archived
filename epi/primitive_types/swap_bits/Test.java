import java.util.LinkedList;
import java.util.List;
public class Test {


	class Case {
		long x;
		long swapped;
		int i;
		int j;
	}

	List<Case> cases = new LinkedList<Case>();

	public void addCases() {
		Case c = new Case();
		c.x = 0b10000100;
		c.swapped = 0b10010000;
		c.i = 2;
		c.j = 4;

		cases.add(c);

		c = new Case();

		c.x = 0b11000010;
		c.swapped = 0b10000011;
		c.i = 6;
		c.j = 0;		
		
		cases.add(c);
	}

	public void testCases(){
		
		for (Case c : cases) {
			System.out.format("Swap binary %s at i = %d j = %d => My answer = %s, correct = %s\n",
				Long.toBinaryString(c.x),
				c.i,
				c.j,
				Long.toBinaryString(Solution.swapBits(c.x, c.i, c.j)),
				Long.toBinaryString(c.swapped)
				);
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.addCases();
		t.testCases();
	}
}