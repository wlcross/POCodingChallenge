package september19;

public class SetsOfThree {

	public static int[] secondMax(int N, int[][] trip) {
		int[] result = new int[N];
		
		for (int i = 0; i < N; i ++) {
			if (trip[i][0] > trip[i][1] && trip[i][0] > trip[i][2]) {
				result[i] = Integer.max(trip[i][1], trip[i][2]);
			} else if (trip[i][0] < trip[i][1] && trip[i][0] < trip[i][2]) {
				result[i] = Integer.min(trip[i][1], trip[i][2]);
			} else {
				result[i] = trip[i][0];
			}
		}
		
		
		return result;
	}
}
