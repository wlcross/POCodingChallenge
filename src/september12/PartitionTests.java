package september12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartitionTests {

	@Test
	void example1() {
		int[] ex1 = {2, 8, 4, 1};
		assertTrue(Partition.canPartition(ex1));
	}
	
	@Test
	void example2() {
		int[] ex2 = {-1, -10, 1, -2, 20};
		assertFalse(Partition.canPartition(ex2));
	}
	
	@Test
	void example3() {
		int[] ex3 = {-1, -20, 5, -1, -2, 2};
		assertTrue(Partition.canPartition(ex3));
	}

}
