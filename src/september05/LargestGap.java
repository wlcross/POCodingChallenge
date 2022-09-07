package september05;

public class LargestGap {

	public static void main (String args[]) {
		
		int[] arr1 = {3, 10, 6, 7};
		System.out.println("Array 1: Expected output = 7");
		System.out.println("Array 1: Actual output = " + largestGap(arr1));
		
		System.out.println("*******");
		
		int[] arr2 = {-3, -1, 6, 7, 0};
		System.out.println("Array 2: Expected output = 10");
		System.out.println("Array 2: Actual output = " + largestGap(arr2));
		
		
	}
	
	public static int largestGap(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] > max) {
				max = arr[i];
			} 
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return max - min;
	}
}
