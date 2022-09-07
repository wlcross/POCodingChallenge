package september05;

public class MaximumSum {

	public static void main (String args []) {
		
		int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Array 1: Expected output = 6");
		System.out.println("Array 1: Actual output = " + maxSum(arr1));
		
		System.out.println("*******");
		
		int[] arr2 = {2, 2, -2};
		System.out.println("Array 2: Expected output = 4");
		System.out.println("Array 2: Actual output = " + maxSum(arr2));
		
		
		
	}
	
	public static int maxSum(int[] arr) {
		
		int max = 0;
		int maxHere = 0;
		
		for (int i = 0; i < arr.length; i ++ ) {
			if (arr[i] > maxHere + arr[i]) {
				maxHere = arr[i];
			} else {
				maxHere = maxHere + arr[i];
			}
			
			if (maxHere > max) {
				max = maxHere;
			}
		}
		
		return max;
	}
}
