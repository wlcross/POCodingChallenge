package september19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class September19Tests {

	
	@Test
	void triplesTest() {
		int[][] testInput = {{1, 2, 3}, {10, 15, 5}, {100, 999, 500}};
		int[] expectedResult = {2, 10, 500};
		assertArrayEquals(SetsOfThree.secondMax(3, testInput), expectedResult);
	}
	
	@Test
	void sumTest() {
		String[] testString = {"ab1231da"};
		assertEquals(SumDigits.sum(1, testString), 7);
	}
}
