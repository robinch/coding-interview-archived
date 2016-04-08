import java.util.LinkedList;
import java.util.List;


public class Test {

	List<Case> cases = new LinkedList<Case>();


	class Case {
		long x;
		long correct;
	}

	public void addCases(){
		Case c = new Case();
		c.x = 0b110; // 6
		c.correct = 0b101; // 5
		cases.add(c);

		c = new Case();

		c.x = 0b00111000L; // 56
		c.correct = 0b00110100L; // 52

		cases.add(c);

	}

	public void testCases(){
		System.out.println("Closest integer same weight");
		for(Case c : cases) {
			System.out.format("x = %s, My answer = %s, Correct = %s\n",
				Long.toBinaryString(c.x),
				Long.toBinaryString(Solution.closestNumberSameWeight(c.x)),
				Long.toBinaryString(c.correct)
				);
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.addCases();
		t.testCases();
	}
}