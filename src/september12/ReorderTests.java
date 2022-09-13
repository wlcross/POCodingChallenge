package september12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReorderTests {

	@Test
	void example1() {
		int[] example = {515, 341, 98, 44, 211};
		int[] actual = {155, 134, 89, 44, 112};
		assertEquals(ReorderDigits.reorderDigits(example, "asc"), actual);
	}
	
	@Test
	void example2() {
		int[] example = {515, 341, 98, 44, 211};
		int[] actual = {551, 431, 89, 44, 112};
		assertEquals(ReorderDigits.reorderDigits(example, "desc"), actual);
	}
	
	@Test
	void example3() {
		int[] example = {63251, 78221};
		int[] actual = {12356, 12278};
		assertEquals(ReorderDigits.reorderDigits(example, "asc"), actual);
	}
	
	@Test
	void example4() {
		int[] example = {63251, 78221};
		int[] actual = {65321, 87221};
		assertEquals(ReorderDigits.reorderDigits(example, "desc"), actual);
	}
	
	@Test
	void example5() {
		int[] example = {1, 2, 3, 4};
		int[] actual = {1, 2, 3, 4};
		assertEquals(ReorderDigits.reorderDigits(example, "asc"), actual);
	}
	
	@Test
	void example6() {
		int[] example = {1, 2, 3, 4};
		int[] actual = {1, 2, 3, 4};
		assertEquals(ReorderDigits.reorderDigits(example, "desc"), actual);
	}
}
