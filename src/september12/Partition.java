package september12;

public class Partition {

	public static boolean canPartition(int[] arr) {
		int product  = 1;
		for (int i = 0; i < arr.length; i ++) {
			product *= arr[i];
		}
		
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] == product / arr[i]) return true;
		}
		
		return false;
	}
}
