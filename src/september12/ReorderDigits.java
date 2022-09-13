package september12;

public class ReorderDigits {

	
	public static int[] reorderDigits(int[] arr, String order) {
		
		for (int i = 0; i < arr.length; i ++) {
			char[] init = ("" + arr[i]).toCharArray();
			char[] sorted = new char[init.length];
			
			if (order.equals("desc")) {
				for (int j = 0; j < sorted.length; j ++) {
					int highest = 0;
					for (int k = 0; k < init.length; k ++) {
						if(init[k] > init[highest]) {
							highest = k;
						}
					}
					sorted[j] = init[highest];
					init[highest] = Character.MIN_VALUE;
				}
				
			} else if (order.equals("asc")) {
				for (int j = 0; j < sorted.length; j ++) {
					int lowest = 0;
					for (int k = 0; k < init.length; k ++) {
						if(init[k] < init[lowest]) {
							lowest = k;
						}
					}
					sorted[j] = init[lowest];
					init[lowest] = Character.MAX_VALUE;
				}
			} else {
				return null;
			}
			
			arr[i] = Integer.parseInt(new String(sorted));
			
		}
		
		return arr;
	}
}

