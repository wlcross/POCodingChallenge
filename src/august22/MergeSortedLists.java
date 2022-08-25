package august22;

public class MergeSortedLists {

	public static int[] merge (int[][] lists) {
		int length = 0;
		for (int i = 0; i < lists.length; i ++) {
			length += lists[i].length;
		}
		
		int[] result = new int[length];
		int[] indices = new int[lists.length];
		
		for (int i = 0; i < length; i ++) {
			int min = Integer.MAX_VALUE;
			int mindex = -1;
			for (int j = 0; j < indices.length; j++) {
				if (indices[j] < lists[j].length && lists[j][indices[j]] < min) {
					mindex = j;
					min = lists[j][indices[j]];
				}
			}
			result[i] = min;
			indices[mindex] ++;
		}
		
		return result;
	}
	
	
	public static void main(String args[]) {
		//int[][] lists = {{1,45,55},{1,3,4},{2,6}};
		//int[][] lists = {};
		int[][] lists = {{}};
		
		int[] result = merge(lists);
		System.out.print("[ ");
		for (int i = 0; i < result.length; i ++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("]");
	}
	
}
